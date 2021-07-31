package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type MatchArguments[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: sinon.sinon.SinonMatcher | T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias sinon.sinon.MatchArguments<T[K]> * / object : never | T[K]}
  */ typings.sinon.sinonStrings.MatchArguments & org.scalablytyped.runtime.TopLevel[js.Any]

/**
  * An instance of a stubbed object type with functions replaced by stubs.
  *
  * @template TType Object type being stubbed.
  */
type SinonStubbedInstance[TType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof TType ]: sinon.sinon.SinonStubbedMember<TType[P]>}
  */ typings.sinon.sinonStrings.SinonStubbedInstance & org.scalablytyped.runtime.TopLevel[TType]

/**
  * Replaces a type with a Sinon stub if it's a function.
  */
type SinonStubbedMember[T] = T | (typings.sinon.mod.SinonStub[js.Any, js.Any])

type SinonTimerId = typings.sinonjsFakeTimers.mod.TimerId
