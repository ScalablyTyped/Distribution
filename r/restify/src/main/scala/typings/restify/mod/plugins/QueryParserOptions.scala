package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParserOptions extends js.Object {
  
  /**
    *  Default false. Transform `?foo.bar=baz` to a nested object: `{foo: {bar: 'baz'}}`.
    */
  var allowDots: js.UndefOr[Boolean] = js.native
  
  /**
    * Default 20. Only transform `?a[$index]=b` to an array if `$index` is less than `arrayLimit`.
    */
  var arrayLimit: js.UndefOr[Double] = js.native
  
  /**
    * Default 5. The depth limit for parsing nested objects, e.g. `?a[b][c][d][e][f][g][h][i]=j`.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * Default `false`. Copies parsed query parameters into `req.params`.
    */
  var mapParams: js.UndefOr[Boolean] = js.native
  
  /**
    * Default `false`. Only applies when if mapParams true. When true, will stomp on req.params field when existing value is found.
    */
  var overrideParams: js.UndefOr[Boolean] = js.native
  
  /**
    * Default 1000. Maximum number of query params parsed. Additional params are silently dropped.
    */
  var parameterLimit: js.UndefOr[Double] = js.native
  
  /**
    * Default true. Whether to parse `?a[]=b&a[1]=c` to an array, e.g. `{a: ['b', 'c']}`.
    */
  var parseArrays: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false. Whether `req.query` is a "plain" object -- does not inherit from `Object`.
    * This can be used to allow query params whose names collide with Object methods, e.g. `?hasOwnProperty=blah`.
    */
  var plainObjects: js.UndefOr[Boolean] = js.native
  
  /**
    * Default false. If true, `?a&b=` results in `{a: null, b: ''}`. Otherwise, `{a: '', b: ''}`.
    */
  var strictNullHandling: js.UndefOr[Boolean] = js.native
}
object QueryParserOptions {
  
  @scala.inline
  def apply(): QueryParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParserOptions]
  }
  
  @scala.inline
  implicit class QueryParserOptionsOps[Self <: QueryParserOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowDots(value: Boolean): Self = this.set("allowDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDots: Self = this.set("allowDots", js.undefined)
    
    @scala.inline
    def setArrayLimit(value: Double): Self = this.set("arrayLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayLimit: Self = this.set("arrayLimit", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setMapParams(value: Boolean): Self = this.set("mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapParams: Self = this.set("mapParams", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = this.set("overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideParams: Self = this.set("overrideParams", js.undefined)
    
    @scala.inline
    def setParameterLimit(value: Double): Self = this.set("parameterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterLimit: Self = this.set("parameterLimit", js.undefined)
    
    @scala.inline
    def setParseArrays(value: Boolean): Self = this.set("parseArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseArrays: Self = this.set("parseArrays", js.undefined)
    
    @scala.inline
    def setPlainObjects(value: Boolean): Self = this.set("plainObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlainObjects: Self = this.set("plainObjects", js.undefined)
    
    @scala.inline
    def setStrictNullHandling(value: Boolean): Self = this.set("strictNullHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictNullHandling: Self = this.set("strictNullHandling", js.undefined)
  }
}
