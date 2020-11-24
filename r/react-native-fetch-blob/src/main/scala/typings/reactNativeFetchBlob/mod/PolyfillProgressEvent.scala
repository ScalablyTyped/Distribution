package typings.reactNativeFetchBlob.mod

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyfillProgressEvent extends EventTarget {
  
  var lengthComputable: Boolean = js.native
  
  var loaded: Double = js.native
  
  var total: Double = js.native
}
