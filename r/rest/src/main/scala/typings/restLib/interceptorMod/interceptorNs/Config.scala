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

object Config {
  @scala.inline
  def apply[T, U](
    error: js.Function3[
      /* response */ restLib.restMod.restNs.Response, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Response | whenLib.WhenNs.Promise[restLib.restMod.restNs.Response]
    ] = null,
    init: js.Function1[/* config */ T, U] = null,
    request: js.Function3[
      /* request */ restLib.restMod.restNs.Request, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Request | whenLib.WhenNs.Promise[restLib.restMod.restNs.Request]
    ] = null,
    response: js.Function3[
      /* response */ restLib.restMod.restNs.Response, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Response | whenLib.WhenNs.Promise[restLib.restMod.restNs.Response]
    ] = null,
    success: js.Function3[
      /* response */ restLib.restMod.restNs.Response, 
      /* config */ U, 
      /* meta */ restLib.restMod.restNs.Meta, 
      restLib.restMod.restNs.Response | whenLib.WhenNs.Promise[restLib.restMod.restNs.Response]
    ] = null
  ): Config[T, U] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (init != null) __obj.updateDynamic("init")(init)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Config[T, U]]
  }
}

