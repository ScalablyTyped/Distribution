package typings.sinon.mod

import typings.sinon.anon.Restore
import typings.sinonjsFakeTimers.mod.Clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type SinonFakeTimers = Clock & Restore

/**
  * An instance of a stubbed object type with functions replaced by stubs.
  *
  * @template TType Object type being stubbed.
  */
type SinonStubbedInstance[TType] = TType & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TType ]: sinon.sinon.SinonStubbedMember<TType[P]>} */ js.Any)

/**
  * Stubbed type of an object with members replaced by stubs.
  *
  * @template TType Type being stubbed.
  */
type StubbableType[TType] = js.Function
