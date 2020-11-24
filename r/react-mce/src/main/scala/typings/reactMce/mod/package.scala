package typings.reactMce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventHandler = js.Function2[/* event */ js.Any, /* editor */ typings.tinymce.mod.Editor, scala.Unit]
  
  type TinyMCE = typings.react.mod.Component[typings.reactMce.mod.ReactMCEProps, js.Object, js.Any]
}
