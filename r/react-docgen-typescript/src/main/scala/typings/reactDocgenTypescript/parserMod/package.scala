package typings.reactDocgenTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parserMod {
  
  type ComponentNameResolver = js.Function2[
    /* exp */ typings.typescript.mod.Symbol, 
    /* source */ typings.typescript.mod.SourceFile, 
    js.UndefOr[
      java.lang.String | scala.Null | typings.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
    ]
  ]
  
  type PropFilter = js.Function2[
    /* props */ typings.reactDocgenTypescript.parserMod.PropItem, 
    /* component */ typings.reactDocgenTypescript.parserMod.Component, 
    scala.Boolean
  ]
  
  type Props = typings.reactDocgenTypescript.parserMod.StringIndexedObject[typings.reactDocgenTypescript.parserMod.PropItem]
  
  type StringIndexedObject[T] = org.scalablytyped.runtime.StringDictionary[T]
}
