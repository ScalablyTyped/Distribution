package typings.rcFieldForm.esInterfaceMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EventArgs = js.Array[Any]

type InternalNamePath = js.Array[String | Double]

type NamePath = String | Double | InternalNamePath

type Rule = RuleObject | RuleRender

type RuleRender = js.Function1[/* form */ FormInstance[Any], RuleObject]

type Store = Record[String, StoreValue]

type StoreValue = Any

type ValidateMessage = String | js.Function0[String]

type Validator = js.Function3[
/* rule */ RuleObject, 
/* value */ StoreValue, 
/* callback */ js.Function1[/* error */ js.UndefOr[String], Unit], 
(js.Promise[Unit | Any]) | Unit]

type ValuedNotifyInfo = NotifyInfo & typings.rcFieldForm.anon.Store

type WatchCallBack = js.Function3[
/* values */ Store, 
/* allValues */ Store, 
/* namePathList */ js.Array[InternalNamePath], 
Unit]
