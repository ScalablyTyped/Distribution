package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Then extends js.Object {
  var cancel: js.Function0[scala.Unit]
  var done: js.Function1[/* repeated */js.Any, _]
  var `then`: js.Function2[
    /* onfulfilled */ js.UndefOr[js.Function0[_]], 
    /* onrejected */ js.UndefOr[js.Function0[_]], 
    js.Promise[_]
  ]
}

