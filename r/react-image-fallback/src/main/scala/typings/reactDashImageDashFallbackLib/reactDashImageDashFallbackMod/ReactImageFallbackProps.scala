package typings
package reactDashImageDashFallbackLib.reactDashImageDashFallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageFallbackProps extends js.Object {
  var fallbackImage: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[java.lang.String] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  var initialImage: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var initialTimeout: js.UndefOr[scala.Double] = js.undefined
  var onError: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onLoad: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var src: java.lang.String
}

object ReactImageFallbackProps {
  @scala.inline
  def apply(
    fallbackImage: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[java.lang.String] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]],
    src: java.lang.String,
    initialImage: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    initialTimeout: scala.Int | scala.Double = null,
    onError: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ] = null,
    onLoad: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ] = null
  ): ReactImageFallbackProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fallbackImage")(fallbackImage.asInstanceOf[js.Any])
    __obj.updateDynamic("src")(src)
    if (initialImage != null) __obj.updateDynamic("initialImage")(initialImage.asInstanceOf[js.Any])
    if (initialTimeout != null) __obj.updateDynamic("initialTimeout")(initialTimeout.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    __obj.asInstanceOf[ReactImageFallbackProps]
  }
}

