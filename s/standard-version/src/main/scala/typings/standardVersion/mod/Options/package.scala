package typings.standardVersion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Options {
  type Skip = typings.std.Partial[
    typings.std.Record[
      typings.standardVersion.standardVersionStrings.bump | typings.standardVersion.standardVersionStrings.changelog | typings.standardVersion.standardVersionStrings.commit | typings.standardVersion.standardVersionStrings.tag, 
      scala.Boolean
    ]
  ]
}
