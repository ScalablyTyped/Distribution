package typings.reduxLittleRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlockCallback = js.Function2[
    /* location */ typings.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typings.reduxLittleRouter.mod.HistoryAction], 
    java.lang.String
  ]
  
  type Href = java.lang.String | typings.reduxLittleRouter.mod.Location
  
  type ListenCallback = js.Function2[
    /* location */ typings.reduxLittleRouter.mod.Location, 
    /* action */ js.UndefOr[typings.reduxLittleRouter.mod.HistoryAction], 
    scala.Unit
  ]
  
  type ObjectLiteral[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Params = typings.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  
  type Query = typings.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]
  
  type Routes = typings.reduxLittleRouter.mod.ObjectLiteral[typings.reduxLittleRouter.mod.ObjectLiteral[js.Any]]
  
  type Unsubscribe = js.Function0[scala.Unit]
}
