package typings.rcFieldForm.interfaceMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EventArgs = js.Array[Any]

type InternalNamePath = js.Array[String | Double]

type InternalValidateFields[Values] = js.Function2[
/* nameList */ js.UndefOr[js.Array[NamePath]], 
/* options */ js.UndefOr[ValidateOptions], 
js.Promise[Values]]

type NamePath = String | Double | InternalNamePath

/** Only return partial when type is not any */
type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array<rc-field-form.rc-field-form/es/interface.RecursivePartial<any>> : T[P] extends object? rc-field-form.rc-field-form/es/interface.RecursivePartial<T[P]> : T[P]}
  */ typings.rcFieldForm.rcFieldFormStrings.RecursivePartial & TopLevel[Any]

type Rule = RuleObject | RuleRender

type RuleRender = js.Function1[/* form */ FormInstance[Any], RuleObject]

type Store = Record[String, StoreValue]

type StoreValue = Any

type ValidateFields[Values] = js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Promise[Values]]

type ValidateMessage = String | js.Function0[String]

type Validator = js.Function3[
/* rule */ RuleObject, 
/* value */ StoreValue, 
/* callback */ js.Function1[/* error */ js.UndefOr[String], Unit], 
(js.Promise[Unit | Any]) | Unit]

type ValuedNotifyInfo = NotifyInfo & typings.rcFieldForm.anon.Store

type WatchCallBack = js.Function2[/* values */ Store, /* namePathList */ js.Array[InternalNamePath], Unit]
