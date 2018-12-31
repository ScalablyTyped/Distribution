package typings
package reactDashMentionsLib.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends js.Object {
  var appendSpaceOnAdd: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.Array[SuggestionDataItem] | DataFunc
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  var onAdd: js.UndefOr[
    js.Function2[/* id */ java.lang.String | scala.Double, /* display */ java.lang.String, scala.Unit]
  ] = js.undefined
  var renderSuggestion: js.UndefOr[
    js.Function5[
      /* suggestion */ SuggestionDataItem, 
      /* search */ java.lang.String, 
      /* highlightedDisplay */ reactLib.reactMod.ReactNs.ReactNode, 
      /* index */ scala.Double, 
      /* focused */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var trigger: java.lang.String | stdLib.RegExp
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

