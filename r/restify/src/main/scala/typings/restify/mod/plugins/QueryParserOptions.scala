package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParserOptions extends StObject {
  
  /**
    *  Default false. Transform `?foo.bar=baz` to a nested object: `{foo: {bar: 'baz'}}`.
    */
  var allowDots: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default 20. Only transform `?a[$index]=b` to an array if `$index` is less than `arrayLimit`.
    */
  var arrayLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Default 5. The depth limit for parsing nested objects, e.g. `?a[b][c][d][e][f][g][h][i]=j`.
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * Default `false`. Copies parsed query parameters into `req.params`.
    */
  var mapParams: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default `false`. Only applies when if mapParams true. When true, will stomp on req.params field when existing value is found.
    */
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default 1000. Maximum number of query params parsed. Additional params are silently dropped.
    */
  var parameterLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Default true. Whether to parse `?a[]=b&a[1]=c` to an array, e.g. `{a: ['b', 'c']}`.
    */
  var parseArrays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false. Whether `req.query` is a "plain" object -- does not inherit from `Object`.
    * This can be used to allow query params whose names collide with Object methods, e.g. `?hasOwnProperty=blah`.
    */
  var plainObjects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default false. If true, `?a&b=` results in `{a: null, b: ''}`. Otherwise, `{a: '', b: ''}`.
    */
  var strictNullHandling: js.UndefOr[Boolean] = js.undefined
}
object QueryParserOptions {
  
  @scala.inline
  def apply(): QueryParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParserOptions]
  }
  
  @scala.inline
  implicit class QueryParserOptionsMutableBuilder[Self <: QueryParserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDots(value: Boolean): Self = StObject.set(x, "allowDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDotsUndefined: Self = StObject.set(x, "allowDots", js.undefined)
    
    @scala.inline
    def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayLimitUndefined: Self = StObject.set(x, "arrayLimit", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
    
    @scala.inline
    def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterLimitUndefined: Self = StObject.set(x, "parameterLimit", js.undefined)
    
    @scala.inline
    def setParseArrays(value: Boolean): Self = StObject.set(x, "parseArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseArraysUndefined: Self = StObject.set(x, "parseArrays", js.undefined)
    
    @scala.inline
    def setPlainObjects(value: Boolean): Self = StObject.set(x, "plainObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainObjectsUndefined: Self = StObject.set(x, "plainObjects", js.undefined)
    
    @scala.inline
    def setStrictNullHandling(value: Boolean): Self = StObject.set(x, "strictNullHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictNullHandlingUndefined: Self = StObject.set(x, "strictNullHandling", js.undefined)
  }
}
