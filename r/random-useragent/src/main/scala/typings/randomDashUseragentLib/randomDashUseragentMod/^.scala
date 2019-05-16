package typings
package randomDashUseragentLib.randomDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-useragent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAll(): js.Array[java.lang.String] = js.native
  def getAll(
    filter: js.Function3[
      /* value */ UserAgent, 
      /* index */ scala.Double, 
      /* array */ js.Array[UserAgent], 
      scala.Boolean
    ]
  ): js.Array[java.lang.String] = js.native
  def getAllData(): js.Array[UserAgent] = js.native
  def getAllData(
    filter: js.Function3[
      /* value */ UserAgent, 
      /* index */ scala.Double, 
      /* array */ js.Array[UserAgent], 
      scala.Boolean
    ]
  ): js.Array[UserAgent] = js.native
  def getRandom(): java.lang.String | scala.Null = js.native
  def getRandom(
    filter: js.Function3[
      /* value */ UserAgent, 
      /* index */ scala.Double, 
      /* array */ js.Array[UserAgent], 
      scala.Boolean
    ]
  ): java.lang.String | scala.Null = js.native
  def getRandomData(): UserAgent | scala.Null = js.native
  def getRandomData(
    filter: js.Function3[
      /* value */ UserAgent, 
      /* index */ scala.Double, 
      /* array */ js.Array[UserAgent], 
      scala.Boolean
    ]
  ): UserAgent | scala.Null = js.native
}

