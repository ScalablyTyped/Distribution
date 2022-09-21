package typings.request.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Cookie = typings.toughCookie.mod.Cookie

type Headers = StringDictionary[Any]

type MultipartBody = String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array

type OptionalUriUrl = RequiredUriUrl | js.Object

type RequestCallback = js.Function3[/* error */ Any, /* response */ Response, /* body */ Any, Unit]

type RequestResponse = Response

// aliases for backwards compatibility
type ResponseRequest = Request
