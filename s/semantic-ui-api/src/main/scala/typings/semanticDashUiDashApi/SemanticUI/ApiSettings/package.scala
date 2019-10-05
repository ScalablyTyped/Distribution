package typings.semanticDashUiDashApi.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ApiSettings {
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.action
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.api
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.beforeSend
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.beforeXHR
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.cache
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.className
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.data
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.dataType
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.debug
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.defaultData
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.encodeParameters
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.error
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.errorDuration
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.hideError
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.interruptRequests
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.loadingDuration
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.metadata
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.method
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.mockResponse
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.mockResponseAsync
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.name
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.namespace
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.on
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.onAbort
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.onComplete
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.onError
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.onFailure
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.onRequest
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.onResponse
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.onSuccess
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.performance
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.regExp
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.response
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.responseAsync
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.selector
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.serializeForm
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.silent
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.stateContext
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.successTest
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.throttle
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.throttleFirstRequest
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.url
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.urlData
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    api | on | cache | stateContext | encodeParameters | defaultData | serializeForm | throttle | throttleFirstRequest | interruptRequests | loadingDuration | hideError | errorDuration | action | url | urlData | response | responseAsync | mockResponse | mockResponseAsync | method | dataType | data | beforeSend | beforeXHR | onRequest | onResponse | successTest | onSuccess | onComplete | onFailure | onError | onAbort | regExp | selector | className | metadata | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      api | on | cache | stateContext | encodeParameters | defaultData | serializeForm | throttle | throttleFirstRequest | interruptRequests | loadingDuration | hideError | errorDuration | action | url | urlData | response | responseAsync | mockResponse | mockResponseAsync | method | dataType | data | regExp | selector | className | metadata | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
