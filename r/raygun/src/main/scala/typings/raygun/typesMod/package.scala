package typings.raygun.typesMod

import typings.raygun.typesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def callVariadicCallback[T](callback: Callback[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def callVariadicCallback[T](callback: Callback[T], error: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def callVariadicCallback[T](callback: Callback[T], error: js.Error, result: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def callVariadicCallback[T](callback: Callback[T], error: Null, result: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def isCallbackWithError[T](cb: Callback[T]): /* is raygun.raygun/build/types.CallbackWithError<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallbackWithError")(cb.asInstanceOf[js.Any]).asInstanceOf[/* is raygun.raygun/build/types.CallbackWithError<T> */ Boolean]

type Callback[T] = CallbackNoError[T] | CallbackWithError[T]

type CallbackNoError[T] = js.Function1[/* t */ T | Null, Unit]

type CallbackWithError[T] = js.Function2[/* e */ js.Error | Null, /* t */ T | Null, Unit]

type CustomData = Any

type Hook[T] = js.Function5[
/* message */ Message, 
/* exception */ js.Error | String, 
/* customData */ CustomData, 
/* request */ js.UndefOr[RequestParams], 
/* tags */ js.UndefOr[js.Array[Tag]], 
T]

type Tag = String
