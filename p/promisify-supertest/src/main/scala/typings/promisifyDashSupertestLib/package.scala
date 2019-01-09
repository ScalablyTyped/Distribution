package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promisifyDashSupertestLib {
  type CallbackHandler = js.Function2[
    /* err */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify supertest.Response */ /* res */ js.Any, 
    scala.Unit
  ]
}
