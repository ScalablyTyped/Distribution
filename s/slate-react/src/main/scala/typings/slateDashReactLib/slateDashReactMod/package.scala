package typings
package slateDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateDashReactMod {
  type EditorProps = BasicEditorProps with Plugin
  type EventHook = js.Function3[
    /* event */ stdLib.Event, 
    /* editor */ slateLib.slateMod.Editor, 
    /* next */ js.Function0[js.Any], 
    js.Any
  ]
  type RenderAttributes = org.scalablytyped.runtime.StringDictionary[js.Any]
}
