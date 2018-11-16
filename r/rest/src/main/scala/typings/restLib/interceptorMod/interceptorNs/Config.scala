package typings
package restLib.interceptorMod.interceptorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config[T, U] extends js.Object {
  var error: js.UndefOr[
    js.Function3[
      /* response */ restLib.restMod.restNs.Response, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Response | whenLib.WhenNs.Promise[restLib.restMod.restNs.Response]
    ]
  ] = js.undefined
  var init: js.UndefOr[js.Function1[/* config */ T, U]] = js.undefined
  var request: js.UndefOr[
    js.Function3[
      /* request */ restLib.restMod.restNs.Request, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Request | whenLib.WhenNs.Promise[restLib.restMod.restNs.Request]
    ]
  ] = js.undefined
  var response: js.UndefOr[
    js.Function3[
      /* response */ restLib.restMod.restNs.Response, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Response | whenLib.WhenNs.Promise[restLib.restMod.restNs.Response]
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* response */ restLib.restMod.restNs.Response, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Response | whenLib.WhenNs.Promise[restLib.restMod.restNs.Response]
    ]
  ] = js.undefined
}

