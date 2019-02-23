package typings
package atPulumiAwsLib.athenaNamedQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedQueryArgs extends js.Object {
  /**
    * The database to which the query belongs.
    */
  val database: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

