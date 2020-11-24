package typings.rdfjsExpressHandler.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import typings.rdfJs.mod.Quad
import typings.rdfjsExpressHandler.anon.Parsers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RdfHandlerOptions extends js.Object {
  
  var baseIriFromRequest: js.UndefOr[Boolean | BaseIriFromRequest] = js.native
  
  var defaultMediaType: js.UndefOr[String] = js.native
  
  var factory: js.UndefOr[DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]] = js.native
  
  var formats: js.UndefOr[Parsers] = js.native
}
object RdfHandlerOptions {
  
  @scala.inline
  def apply(): RdfHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdfHandlerOptions]
  }
  
  @scala.inline
  implicit class RdfHandlerOptionsOps[Self <: RdfHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseIriFromRequestFunction1(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Promise[String] | String): Self = this.set("baseIriFromRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBaseIriFromRequest(value: Boolean | BaseIriFromRequest): Self = this.set("baseIriFromRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseIriFromRequest: Self = this.set("baseIriFromRequest", js.undefined)
    
    @scala.inline
    def setDefaultMediaType(value: String): Self = this.set("defaultMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMediaType: Self = this.set("defaultMediaType", js.undefined)
    
    @scala.inline
    def setFactory(value: DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]): Self = this.set("factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactory: Self = this.set("factory", js.undefined)
    
    @scala.inline
    def setFormats(value: Parsers): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
  }
}
