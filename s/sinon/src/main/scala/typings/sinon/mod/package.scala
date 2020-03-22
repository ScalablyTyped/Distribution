package typings.sinon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SinonStatic = typings.sinon.mod.SinonSandbox with typings.sinon.mod.LegacySandbox with typings.sinon.mod.SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TType ]: sinon.sinon.SinonStubbedMember<TType[P]>}
    */ typings.sinon.sinonStrings.SinonStubbedInstance with TType
  /**
    * Replaces a type with a Sinon stub if it's a function.
    */
  type SinonStubbedMember[T] = T | typings.sinon.mod.SinonStub
  type SinonTimerId = scala.Double | typings.sinon.AnonId
}
