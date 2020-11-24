package typings.scrivito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributeBasedValidation = js.Tuple2[java.lang.String, typings.scrivito.mod.AttributeValidationCallback]
  
  type AttributeValidationCallback = js.Function2[
    /* current */ js.Any, 
    /* options */ typings.scrivito.anon.Content, 
    typings.scrivito.mod.ValidationReturnType
  ]
  
  type AttributeWithOptions = js.Tuple2[typings.scrivito.mod.Attribute, typings.scrivito.mod.AttributeOptions]
  
  type ClassBasedValidation = js.Function1[
    /* target */ typings.scrivito.mod.Widget | typings.scrivito.mod.Obj, 
    typings.scrivito.mod.ValidationReturnType
  ]
  
  type EditingConfigAttributes = org.scalablytyped.runtime.StringDictionary[typings.scrivito.mod.AttributeProps]
  
  type ObjComponent = typings.react.mod.FC[typings.scrivito.mod.ObjComponentProps]
  
  type ObjSearchAttribute = typings.scrivito.mod.ObjSearchSingleAttribute | js.Array[typings.scrivito.mod.ObjSearchSingleAttribute]
  
  type ObjSearchAttributeBasedBoost = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.scrivito.scrivitoStrings.Asterisk
    - typings.scrivito.scrivitoStrings.id
    - typings.scrivito.scrivitoStrings._createdAt
    - typings.scrivito.scrivitoStrings._lastChanged
    - typings.scrivito.scrivitoStrings._objClass
    - typings.scrivito.scrivitoStrings._path
    - typings.scrivito.scrivitoStrings._permalink
    - typings.scrivito.scrivitoStrings._restriction
    - typings.scrivito.scrivitoStrings.MetadataCollection
    - java.lang.String
  */
  type ObjSearchSingleAttribute = typings.scrivito.mod._ObjSearchSingleAttribute | java.lang.String
  
  type ObjSearchValue = java.lang.String | typings.std.Date | scala.Double | typings.scrivito.mod.Obj | js.Array[js.Any]
  
  type OrderParam = typings.scrivito.mod.ObjSearchSingleAttribute | (js.Tuple2[
    typings.scrivito.mod.ObjSearchSingleAttribute, 
    typings.scrivito.scrivitoStrings.asc | typings.scrivito.scrivitoStrings.desc
  ])
  
  type Validation = typings.scrivito.mod.AttributeBasedValidation | typings.scrivito.mod.ClassBasedValidation
  
  type ValidationReturnType = js.UndefOr[typings.scrivito.anon.Message | java.lang.String]
  
  type WidgetClass = org.scalablytyped.runtime.Instantiable1[/* arg */ js.Object, typings.scrivito.mod.Widget]
  
  type WidgetComponent = typings.react.mod.FC[typings.scrivito.mod.WidgetComponentProps]
}
