package typings.smallweiAvue

import typings.smallweiAvue.anon.Colspan
import typings.smallweiAvue.anon.ColumnColumnIndex
import typings.smallweiAvue.anon.Data
import typings.smallweiAvue.anon.RowIndex
import typings.smallweiAvue.anon.TextValue
import typings.std.Event
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CellCls[T] = String | (js.Function1[/* data */ ColumnColumnIndex[T], String])

type CellEvent[T] = js.Function4[/* row */ Any, /* column */ TableColumnCtx[T], /* cell */ Any, /* event */ Event, Unit]

type ColumnCls[T] = String | (js.Function1[/* data */ RowIndex[T], String])

type Component = Any

type EnumString = js.UndefOr[String]

/**
  *  Rule for validating a value exists in an enumerable list.
  *
  *  @param rule The validation rule.
  *  @param value The value of the field on the source object.
  *  @param source The source object being validated.
  *  @param errors An array of errors that this rule may add
  *  validation errors to.
  *  @param options The validation options.
  *  @param options.messages The validation messages.
  *  @param type Rule type
  */
type ExecuteRule = js.Function6[
/* rule */ InternalRuleItem, 
/* value */ Value, 
/* source */ Values, 
/* errors */ js.Array[String], 
/* options */ ValidateOption, 
/* type */ js.UndefOr[String], 
Unit]

/**
  *  Performs validation for any type.
  *
  *  @param rule The validation rule.
  *  @param value The value of the field on the source object.
  *  @param callback The callback function.
  *  @param source The source object being validated.
  *  @param options The validation options.
  *  @param options.messages The validation messages.
  */
type ExecuteValidator = js.Function5[
/* rule */ InternalRuleItem, 
/* value */ Value, 
/* callback */ js.Function1[/* error */ js.UndefOr[js.Array[String]], Unit], 
/* source */ Values, 
/* options */ ValidateOption, 
Unit]

type FilterMethods[T] = js.Function3[/* value */ Any, /* row */ T, /* column */ TableColumnCtx[T], Unit]

type Filters = js.Array[TextValue]

type FullField = js.UndefOr[String]

type HeaderEvent[T] = js.Function2[/* column */ TableColumnCtx[T], /* event */ Event, Unit]

type Pattern = js.UndefOr[String | js.RegExp]

type RangeNumber = js.UndefOr[Double]

type RowEvent[T] = js.Function3[/* row */ Any, /* column */ TableColumnCtx[T], /* event */ Event, Unit]

type Rule = RuleItem | js.Array[RuleItem]

type Rules = Record[String, Rule]

type SpanMethod[T] = js.Function1[/* data */ ColumnColumnIndex[T], js.UndefOr[js.Array[Double] | Colspan]]

type SummaryMethod[T] = js.Function1[/* data */ Data[T], js.Array[String]]

type SyncErrorType = js.Error | String

type SyncValidateResult = Boolean | SyncErrorType | js.Array[SyncErrorType]

type Type = js.UndefOr[String]

type VNode = Any

type ValidateCallback = js.Function2[
/* errors */ js.Array[ValidateError] | Null, 
/* fields */ ValidateFieldsError | Values, 
Unit]

type ValidateFieldsError = Record[String, js.Array[ValidateError]]

type ValidateMessage[T /* <: js.Array[Any] */] = String | (js.Function1[/* args */ T, String])

type ValidateResult = js.UndefOr[js.Promise[Unit] | SyncValidateResult]

type Value = Any

type Values = Record[String, Value]
