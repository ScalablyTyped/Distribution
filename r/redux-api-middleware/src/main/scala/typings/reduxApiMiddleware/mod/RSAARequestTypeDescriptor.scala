package typings.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAARequestTypeDescriptor[State, Payload, Meta] extends js.Object {
  var meta: js.UndefOr[
    (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta | js.Promise[Meta]]) | Meta
  ] = js.undefined
  var payload: js.UndefOr[
    (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload | js.Promise[Payload]]) | Payload
  ] = js.undefined
  var `type`: String | js.Symbol
}

object RSAARequestTypeDescriptor {
  @scala.inline
  def apply[State, Payload, Meta](
    `type`: String | js.Symbol,
    meta: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta | js.Promise[Meta]]) | Meta = null,
    payload: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload | js.Promise[Payload]]) | Payload = null
  ): RSAARequestTypeDescriptor[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAARequestTypeDescriptor[State, Payload, Meta]]
  }
}

