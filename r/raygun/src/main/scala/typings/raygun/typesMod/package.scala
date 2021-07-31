package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def callVariadicCallback[T](callback: typings.raygun.typesMod.Callback[T]): scala.Unit = typings.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def callVariadicCallback[T](callback: typings.raygun.typesMod.Callback[T], error: scala.Null, result: T): scala.Unit = (typings.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def callVariadicCallback[T](callback: typings.raygun.typesMod.Callback[T], error: typings.std.Error): scala.Unit = (typings.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def callVariadicCallback[T](callback: typings.raygun.typesMod.Callback[T], error: typings.std.Error, result: T): scala.Unit = (typings.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("callVariadicCallback")(callback.asInstanceOf[js.Any], error.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def isCallbackWithError[T](cb: typings.raygun.typesMod.Callback[T]): /* is raygun.raygun/build/types.CallbackWithError<T> */ scala.Boolean = typings.raygun.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCallbackWithError")(cb.asInstanceOf[js.Any]).asInstanceOf[/* is raygun.raygun/build/types.CallbackWithError<T> */ scala.Boolean]

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
T]

type RequestParams = (typings.raygun.anon.Host | typings.raygun.anon.Hostname) & typings.raygun.typesMod.CommonRequestParams

type Tag = java.lang.String
