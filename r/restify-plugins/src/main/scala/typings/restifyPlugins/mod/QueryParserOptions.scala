package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParserOptions extends js.Object {
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
  def apply(
    allowDots: js.UndefOr[Boolean] = js.undefined,
    arrayLimit: js.UndefOr[Double] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    mapParams: js.UndefOr[Boolean] = js.undefined,
    overrideParams: js.UndefOr[Boolean] = js.undefined,
    parameterLimit: js.UndefOr[Double] = js.undefined,
    parseArrays: js.UndefOr[Boolean] = js.undefined,
    plainObjects: js.UndefOr[Boolean] = js.undefined,
    strictNullHandling: js.UndefOr[Boolean] = js.undefined
  ): QueryParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrayLimit)) __obj.updateDynamic("arrayLimit")(arrayLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parameterLimit)) __obj.updateDynamic("parameterLimit")(parameterLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseArrays)) __obj.updateDynamic("parseArrays")(parseArrays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plainObjects)) __obj.updateDynamic("plainObjects")(plainObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParserOptions]
  }
}

