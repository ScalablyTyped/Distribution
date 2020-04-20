package typings.rdfjsExpressHandler.mod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import typings.rdfJs.mod.Quad
import typings.rdfjsExpressHandler.AnonParsers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RdfHandlerOptions extends js.Object {
  var baseIriFromRequest: js.UndefOr[Boolean | BaseIriFromRequest] = js.undefined
  var defaultMediaType: js.UndefOr[String] = js.undefined
  var factory: js.UndefOr[DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]] = js.undefined
  var formats: js.UndefOr[AnonParsers] = js.undefined
}

object RdfHandlerOptions {
  @scala.inline
  def apply(
    baseIriFromRequest: Boolean | BaseIriFromRequest = null,
    defaultMediaType: String = null,
    factory: DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]] = null,
    formats: AnonParsers = null
  ): RdfHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (baseIriFromRequest != null) __obj.updateDynamic("baseIriFromRequest")(baseIriFromRequest.asInstanceOf[js.Any])
    if (defaultMediaType != null) __obj.updateDynamic("defaultMediaType")(defaultMediaType.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdfHandlerOptions]
  }
}

