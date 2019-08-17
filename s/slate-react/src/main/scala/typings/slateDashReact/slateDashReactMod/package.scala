package typings.slateDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateDashReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Event

  type EditorProps = BasicEditorProps with Plugin
  type EventHook = js.Function3[
    /* event */ Event, 
    /* editor */ typings.slate.slateMod.Editor, 
    /* next */ js.Function0[js.Any], 
    js.Any
  ]
  type OnChangeFn = js.Function1[/* change */ OnChangeParam, js.Any]
  type RenderAttributes = StringDictionary[js.Any]
}
