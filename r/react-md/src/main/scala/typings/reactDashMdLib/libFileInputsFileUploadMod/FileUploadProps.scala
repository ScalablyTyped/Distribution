package typings
package reactDashMdLib.libFileInputsFileUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadProps
  extends reactDashMdLib.libFileInputsFileInputMod.FileInputProps {
  var maxSize: js.UndefOr[scala.Double] = js.native
  var onAbort: js.UndefOr[js.Function2[/* file */ stdLib.File, /* event */ reactLib.Event, scala.Unit]] = js.native
  var onError: js.UndefOr[
    js.Function3[
      /* file */ stdLib.File, 
      /* error */ nodeLib.Error, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.native
  var onLoad: js.UndefOr[
    js.Function3[
      /* file */ stdLib.File, 
      /* result */ java.lang.String | stdLib.ArrayBuffer, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.native
  var onLoadEnd: js.UndefOr[js.Function2[/* file */ stdLib.File, /* event */ reactLib.Event, scala.Unit]] = js.native
  var onLoadStart: js.UndefOr[js.Function2[/* file */ stdLib.File, /* event */ reactLib.Event, scala.Unit]] = js.native
  var onProgress: js.UndefOr[
    js.Function3[
      /* file */ stdLib.File, 
      /* progress */ scala.Double, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.native
  var onSizeError: js.UndefOr[js.Function1[/* errorFiles */ js.Array[stdLib.File], scala.Unit]] = js.native
  var readAs: js.UndefOr[reactDashMdLib.libFileInputsFileInputMod.FileReaderTypes | ReadAs] = js.native
}

