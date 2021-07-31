package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Cookie = typings.toughCookie.mod.Cookie

type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]

type MultipartBody = java.lang.String | typings.node.Buffer | typings.std.ArrayBuffer | typings.std.Uint8Array

type OptionalUriUrl = typings.request.mod.RequiredUriUrl | js.Object

type RequestCallback = js.Function3[
/* error */ js.Any, 
/* response */ typings.request.mod.Response, 
/* body */ js.Any, 
scala.Unit]

type RequestResponse = typings.request.mod.Response

// aliases for backwards compatibility
type ResponseRequest = typings.request.mod.Request
