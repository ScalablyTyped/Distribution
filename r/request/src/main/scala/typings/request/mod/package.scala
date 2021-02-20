package typings.request

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cookie = typings.toughCookie.mod.Cookie
  
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type MultipartBody = java.lang.String | typings.node.Buffer | typings.std.ArrayBuffer | typings.std.Uint8Array
  
  type OptionalUriUrl = typings.request.mod.RequiredUriUrl | js.Object
  
  type Options = typings.request.mod.OptionsWithUri | typings.request.mod.OptionsWithUrl
  
  type OptionsWithUri = typings.request.mod.UriOptions with typings.request.mod.CoreOptions
  
  type OptionsWithUrl = typings.request.mod.UrlOptions with typings.request.mod.CoreOptions
  
  type RequestCallback = js.Function3[
    /* error */ js.Any, 
    /* response */ typings.request.mod.Response, 
    /* body */ js.Any, 
    scala.Unit
  ]
  
  type RequestResponse = typings.request.mod.Response
  
  // aliases for backwards compatibility
  type ResponseRequest = typings.request.mod.Request
}
