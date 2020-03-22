package typings.standardEngine.mod

import typings.eslint.mod.CLIEngine.LintReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("standard-engine", "standardEngine")
@js.native
object standardEngine extends js.Object {
  @js.native
  trait Linter extends js.Object {
    /**
      * Lint the provided files globs.
      * An opts object may be provided
      */
    def lintFiles(files: String, callback: LintCallback): Unit = js.native
    def lintFiles(files: String, opts: js.UndefOr[scala.Nothing], callback: LintCallback): Unit = js.native
    def lintFiles(files: String, opts: LintFilesOptions, callback: LintCallback): Unit = js.native
    def lintFiles(files: js.Array[String], callback: LintCallback): Unit = js.native
    def lintFiles(files: js.Array[String], opts: js.UndefOr[scala.Nothing], callback: LintCallback): Unit = js.native
    def lintFiles(files: js.Array[String], opts: LintFilesOptions, callback: LintCallback): Unit = js.native
    def lintText(text: String, callback: LintCallback): Unit = js.native
    def lintText(text: String, opts: LintTextOptions, callback: LintCallback): Unit = js.native
    /**
      * Lint the provided source text to enforce your defined style.
      * An opts object may be provided
      */
    def lintTextSync(text: String): LintReport = js.native
    def lintTextSync(text: String, opts: LintTextOptions): LintReport = js.native
  }
  
}

