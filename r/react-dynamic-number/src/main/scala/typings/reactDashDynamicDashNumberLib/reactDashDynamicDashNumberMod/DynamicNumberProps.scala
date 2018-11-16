package typings
package reactDashDynamicDashNumberLib.reactDashDynamicDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ 
trait DynamicNumberProps extends js.Object {
  var fraction: js.UndefOr[scala.Double] = js.undefined
  var integer: js.UndefOr[scala.Double] = js.undefined
  var negative: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement], 
      /* modelValue */ scala.Double, 
      /* viewValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[
    reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.DOT | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.`,`
  ] = js.undefined
  var thousand: js.UndefOr[
    scala.Boolean | (reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.` `)
  ] = js.undefined
  var value: js.UndefOr[
    scala.Double | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.Empty
  ] = js.undefined
}

