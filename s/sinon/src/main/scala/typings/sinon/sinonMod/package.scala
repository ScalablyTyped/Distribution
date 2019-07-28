package typings.sinon

import typings.sinon.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sinonMod {
  type SinonStatic = SinonSandbox with LegacySandbox with SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof TType ]: sinon.sinon.SinonStubbedMember<TType[P]>}
    */ typings.sinon.sinonStrings.SinonStubbedInstance with TType
  /**
    * Replaces a type with a Sinon stub if it's a function.
    */
  type SinonStubbedMember[T] = T | SinonStub
  type SinonTimerId = Double | Anon_Id
  /**
    * Stubbed type of an object with members replaced by stubs.
    *
    * @template TType Type being stubbed.
    */
  type StubbableType[TType] = js.Function with js.Object
}
