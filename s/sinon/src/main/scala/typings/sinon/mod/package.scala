package typings.sinon.mod

import org.scalablytyped.runtime.TopLevel
import typings.sinon.anon.Restore
import typings.sinonjsFakeTimers.mod.Clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DeepPartialOrMatcher[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? sinon.sinon.SinonMatcher | T[K] extends object? sinon.sinon.DeepPartialOrMatcher<T[K]> : T[K]}
  */ typings.sinon.sinonStrings.DeepPartialOrMatcher & TopLevel[Any]

type MatchArguments[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: sinon.sinon.SinonMatcher | T[K] extends object? sinon.sinon.MatchArguments<T[K]> : never | T[K]}
  */ typings.sinon.sinonStrings.MatchArguments & TopLevel[Any]

type SinonFakeTimers = Clock & Restore

type SinonSpiedInstance[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: sinon.sinon.SinonSpiedMember<T[P]>}
  */ typings.sinon.sinonStrings.SinonSpiedInstance & TopLevel[T]

type SinonSpiedMember[T] = T | (SinonSpy[Any, Any])

/**
  * An instance of a stubbed object type with functions replaced by stubs.
  *
  * @template TType Object type being stubbed.
  */
type SinonStubbedInstance[TType] = TType & typings.sinon.sinonStrings.SinonStubbedInstance & TopLevel[TType]

/**
  * Replaces a type with a Sinon stub if it's a function.
  */
type SinonStubbedMember[T] = T | (SinonStub[Any, Any])

/**
  * Stubbed type of an object with members replaced by stubs.
  *
  * @template TType Type being stubbed.
  */
type StubbableType[TType] = js.Function
