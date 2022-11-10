package typings.sinon.mod

import typings.sinon.anon.Restore
import typings.sinonjsFakeTimers.mod.Clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type SinonFakeTimers = Clock & Restore

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends (args : infer TArgs): infer TReturnValue ? sinon.sinon.SinonSpy<TArgs, TReturnValue> : T
  }}}
  */
type SinonSpiedMember[T] = T

/**
  * An instance of a stubbed object type with functions replaced by stubs.
  *
  * @template TType Object type being stubbed.
  */
type SinonStubbedInstance[TType] = TType & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TType ]: sinon.sinon.SinonStubbedMember<TType[P]>} */ js.Any)

/**
  * Replaces a type with a Sinon stub if it's a function.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends (args : infer TArgs): infer TReturnValue ? sinon.sinon.SinonStub<TArgs, TReturnValue> : T
  }}}
  */
type SinonStubbedMember[T] = T

/**
  * Stubbed type of an object with members replaced by stubs.
  *
  * @template TType Type being stubbed.
  */
type StubbableType[TType] = js.Function
