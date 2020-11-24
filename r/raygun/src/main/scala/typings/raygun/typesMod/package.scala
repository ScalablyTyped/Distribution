package typings.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Callback[T] = typings.raygun.typesMod.CallbackNoError[T] | typings.raygun.typesMod.CallbackWithError[T]
  
  type CallbackNoError[T] = js.Function1[/* t */ T | scala.Null, scala.Unit]
  
  type CallbackWithError[T] = js.Function2[/* e */ typings.std.Error | scala.Null, /* t */ T | scala.Null, scala.Unit]
  
  type CustomData = js.Any
  
  type Hook[T] = js.Function5[
    /* message */ typings.raygun.typesMod.Message, 
    /* exception */ typings.std.Error | java.lang.String, 
    /* customData */ typings.raygun.typesMod.CustomData, 
    /* request */ js.UndefOr[typings.raygun.typesMod.RequestParams], 
    /* tags */ js.UndefOr[js.Array[typings.raygun.typesMod.Tag]], 
    T
  ]
  
  type RequestParams = (typings.raygun.anon.Host | typings.raygun.anon.Hostname) with typings.raygun.typesMod.CommonRequestParams
  
  type Tag = java.lang.String
}
