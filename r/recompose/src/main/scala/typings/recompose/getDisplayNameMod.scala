package typings.recompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#getdisplayname
object getDisplayNameMod {
  
  @JSImport("recompose/getDisplayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(component: ComponentType[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[String]
}
