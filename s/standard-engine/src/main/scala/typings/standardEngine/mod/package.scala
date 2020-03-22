package typings.standardEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LintCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* results */ typings.eslint.mod.CLIEngine.LintReport, 
    scala.Unit
  ]
  type LintFilesOptions = (typings.std.Exclude[
    typings.standardEngine.mod.Options, 
    typings.standardEngine.standardEngineStrings.cwd | typings.standardEngine.standardEngineStrings.filename
  ]) with typings.standardEngine.mod.LintDefaultOptions
  type LintTextOptions = (typings.std.Exclude[
    typings.standardEngine.mod.Options, 
    typings.standardEngine.standardEngineStrings.ignore | typings.standardEngine.standardEngineStrings.cwd
  ]) with typings.standardEngine.mod.LintDefaultOptions
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type PickWithSomeRequired[T, TRequired /* <: java.lang.String */] = (typings.standardEngine.mod.Omit[T, TRequired]) with (typings.std.Pick[typings.std.Required[T], TRequired])
}
