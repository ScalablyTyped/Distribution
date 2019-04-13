package typings
package restangularLib.restangularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvider extends js.Object {
  def addElementTransformer(route: java.lang.String, isCollection: scala.Boolean, transformer: js.Function): IProvider = js.native
  def addElementTransformer(route: java.lang.String, transformer: js.Function): IProvider = js.native
  def addFullRequestInterceptor(
    requestInterceptor: js.Function7[
      /* element */ js.Any, 
      /* operation */ java.lang.String, 
      /* what */ java.lang.String, 
      /* url */ java.lang.String, 
      /* headers */ js.Any, 
      /* params */ js.Any, 
      /* httpConfig */ angularLib.angularMod.IRequestShortcutConfig, 
      restangularLib.Anon_ElementHeaders
    ]
  ): IProvider = js.native
  def addRequestInterceptor(
    requestInterceptor: js.Function4[
      /* element */ js.Any, 
      /* operation */ java.lang.String, 
      /* what */ java.lang.String, 
      /* url */ java.lang.String, 
      _
    ]
  ): IProvider = js.native
  def addResponseInterceptor(
    responseInterceptor: js.Function6[
      /* data */ js.Any, 
      /* operation */ java.lang.String, 
      /* what */ java.lang.String, 
      /* url */ java.lang.String, 
      /* response */ IResponse, 
      /* deferred */ angularLib.angularMod.IDeferred[_], 
      _
    ]
  ): IProvider = js.native
  def extendCollection(route: java.lang.String, extender: js.Function1[/* collection */ ICollection, _]): IProvider = js.native
  def extendModel(route: java.lang.String, extender: js.Function1[/* model */ IElement, _]): IProvider = js.native
  def setBaseUrl(baseUrl: java.lang.String): IProvider = js.native
  def setDefaultHeaders(headers: js.Any): IProvider = js.native
  def setDefaultHttpFields(httpFields: js.Any): IProvider = js.native
  def setDefaultRequestParams(method: java.lang.String, params: js.Any): IProvider = js.native
  def setDefaultRequestParams(methods: js.Array[java.lang.String], params: js.Any): IProvider = js.native
  def setDefaultRequestParams(params: js.Any): IProvider = js.native
  def setEncodeIds(encode: scala.Boolean): IProvider = js.native
  def setErrorInterceptor(
    errorInterceptor: js.Function3[
      /* response */ IResponse, 
      /* deferred */ angularLib.angularMod.IDeferred[_], 
      /* responseHandler */ js.Function1[/* response */ IResponse, _], 
      _
    ]
  ): IProvider = js.native
  def setExtraFields(fields: js.Array[java.lang.String]): IProvider = js.native
  def setFullRequestInterceptor(
    fullRequestInterceptor: js.Function7[
      /* element */ js.Any, 
      /* operation */ java.lang.String, 
      /* what */ java.lang.String, 
      /* url */ java.lang.String, 
      /* headers */ js.Any, 
      /* params */ js.Any, 
      /* httpConfig */ angularLib.angularMod.IRequestShortcutConfig, 
      restangularLib.Anon_Element
    ]
  ): IProvider = js.native
  def setFullResponse(fullResponse: scala.Boolean): IProvider = js.native
  def setJsonp(jsonp: scala.Boolean): IProvider = js.native
  def setMethodOverriders(overriders: js.Array[java.lang.String]): IProvider = js.native
  def setOnElemRestangularized(
    callback: js.Function4[
      /* elem */ js.Any, 
      /* isCollection */ scala.Boolean, 
      /* what */ java.lang.String, 
      /* restangular */ IService, 
      _
    ]
  ): IProvider = js.native
  def setParentless(parentless: scala.Boolean, routes: js.Array[java.lang.String]): IProvider = js.native
  def setParentless(value: js.Any): IProvider = js.native
  def setPlainByDefault(isPlain: scala.Boolean): IProvider = js.native
  def setRequestInterceptor(
    requestInterceptor: js.Function4[
      /* element */ js.Any, 
      /* operation */ java.lang.String, 
      /* what */ java.lang.String, 
      /* url */ java.lang.String, 
      _
    ]
  ): IProvider = js.native
  def setRequestSuffix(suffix: java.lang.String): IProvider = js.native
  def setResponseExtractor(
    responseInterceptor: js.Function6[
      /* data */ js.Any, 
      /* operation */ java.lang.String, 
      /* what */ java.lang.String, 
      /* url */ java.lang.String, 
      /* response */ IResponse, 
      /* deferred */ angularLib.angularMod.IDeferred[_], 
      _
    ]
  ): IProvider = js.native
  def setResponseInterceptor(
    responseInterceptor: js.Function6[
      /* data */ js.Any, 
      /* operation */ java.lang.String, 
      /* what */ java.lang.String, 
      /* url */ java.lang.String, 
      /* response */ IResponse, 
      /* deferred */ angularLib.angularMod.IDeferred[_], 
      _
    ]
  ): IProvider = js.native
  def setRestangularFields(fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): IProvider = js.native
  def setSelfLinkAbsoluteUrl(value: scala.Boolean): IProvider = js.native
  def setTransformOnlyServerElements(active: scala.Boolean): IProvider = js.native
  def setUseCannonicalId(useCannonicalId: scala.Boolean): IProvider = js.native
}

