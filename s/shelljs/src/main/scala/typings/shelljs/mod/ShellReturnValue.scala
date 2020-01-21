package typings.shelljs.mod

import typings.node.childProcessMod.ChildProcess
import typings.shelljs.AnonAsync
import typings.shelljs.AnonAsyncTrue
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellReturnValue extends ExecOutputReturnValue {
  /**
  	 * Returns a string containing the given pipeline, or a concatenated string
  	 * containing the pipelines if more than one input stream is given
  	 * (a new line character is introduced between each input).
  	 *
  	 * @return A string containing the given pipeline, or a concatenated string
  	 *         containing the pipelines if more than one input stream is given
  	 *         (a new line character is introduced between each input).
  	 */
  @JSName("cat")
  var cat_Original: CatFunction = js.native
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param [callback] Receives code and output asynchronously.
  	 * @return Returns an object containing the return code and output as string,
  	 *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
  	 */
  @JSName("exec")
  var exec_Original: ExecFunction = js.native
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-v`: Inverse the sense of the regex and print
  	 *                the lines not matching the criteria.
  	 *        - `-l`: Print only filenames of matching files
  	 * @param regex_filter The regular expression to use.
  	 * @return Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  @JSName("grep")
  var grep_Original: GrepFunction = js.native
  /**
  	 * Read the start of a pipeline input.
  	 */
  @JSName("head")
  var head_Original: HeadFunction = js.native
  /**
  	 * Reads an input string from pipeline and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Replace contents of 'file' in-place. Note that no backups will be created!
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @return            The new string after replacement.
  	 */
  @JSName("sed")
  var sed_Original: SedFunction = js.native
  /**
  	 * Return the contents of the pipeline, sorted line-by-line.
  	 *
  	 * @param options Available options:
  	 *        - `-r`: Reverse the results
  	 *        - `-n`: Compare according to numerical value
  	 */
  @JSName("sort")
  var sort_Original: SortFunction = js.native
  /**
  	 * Read the end of a pipeline input.
  	 */
  @JSName("tail")
  var tail_Original: TailFunction = js.native
  /**
  	 * Filter adjacent matching lines from input.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Ignore case while comparing
  	 *        - `-c`: Prefix lines by the number of occurrences
  	 *        - `-d`: Only print duplicate lines, one for each group of identical lines
  	 */
  @JSName("uniq")
  var uniq_Original: UniqFunction = js.native
  /**
  	 * Returns a string containing the given pipeline, or a concatenated string
  	 * containing the pipelines if more than one input stream is given
  	 * (a new line character is introduced between each input).
  	 *
  	 * @return A string containing the given pipeline, or a concatenated string
  	 *         containing the pipelines if more than one input stream is given
  	 *         (a new line character is introduced between each input).
  	 */
  def cat(files: String*): ShellString = js.native
  /**
  	 * Returns a string containing the given file, or a concatenated string
  	 * containing the files if more than one file is given (a new line character
  	 * is introduced between each file).
  	 *
  	 * @param files Files to use. Wildcard `*` accepted.
  	 * @return A string containing the given file, or a concatenated string
  	 *         containing the files if more than one file is given
  	 *         (a new line character is introduced between each file).
  	 */
  /**
  	 * Returns a string containing the given pipeline, or a concatenated string
  	 * containing the pipelines if more than one input stream is given
  	 * (a new line character is introduced between each input).
  	 *
  	 * @return A string containing the given pipeline, or a concatenated string
  	 *         containing the pipelines if more than one input stream is given
  	 *         (a new line character is introduced between each input).
  	 */
  def cat(files: js.Array[String]): ShellString = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @return        Returns an object containing the return code and output as string.
  	 */
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param [callback] Receives code and output asynchronously.
  	 * @return Returns an object containing the return code and output as string,
  	 *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
  	 */
  def exec(command: String): ShellString = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param callback Receives code and output asynchronously.
  	 */
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param [callback] Receives code and output asynchronously.
  	 * @return Returns an object containing the return code and output as string,
  	 *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
  	 */
  def exec(command: String, callback: ExecCallback): ChildProcess = js.native
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @return        Returns an object containing the return code and output as string,
  	 *                or if `{async: true}` was passed, a `ChildProcess`.
  	 */
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param [callback] Receives code and output asynchronously.
  	 * @return Returns an object containing the return code and output as string,
  	 *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
  	 */
  def exec(command: String, options: ExecOptions): ShellString | ChildProcess = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param callback Receives code and output asynchronously.
  	 */
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param [callback] Receives code and output asynchronously.
  	 * @return Returns an object containing the return code and output as string,
  	 *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
  	 */
  def exec(command: String, options: ExecOptions, callback: ExecCallback): ChildProcess = js.native
  /**
  	 * Executes the given command asynchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @return        Returns an object containing the return code and output as string,
  	 *                or if `{async: true}` was passed, a `ChildProcess`.
  	 */
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param [callback] Receives code and output asynchronously.
  	 * @return Returns an object containing the return code and output as string,
  	 *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
  	 */
  @JSName("exec")
  def exec_ChildProcess(command: String, options: ExecOptions with AnonAsyncTrue): ChildProcess = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @return        Returns an object containing the return code and output as string,
  	 *                or if `{async: true}` was passed, a `ChildProcess`.
  	 */
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param [callback] Receives code and output asynchronously.
  	 * @return Returns an object containing the return code and output as string,
  	 *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
  	 */
  @JSName("exec")
  def exec_ShellString(command: String, options: ExecOptions with AnonAsync): ShellString = js.native
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-v`: Inverse the sense of the regex and print
  	 *                the lines not matching the criteria.
  	 *        - `-l`: Print only filenames of matching files
  	 * @param regex_filter The regular expression to use.
  	 * @return Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  def grep(options: String, regex_filter: String, files: String*): ShellString = js.native
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-v`: Inverse the sense of the regex and print
  	 *                the lines not matching the criteria.
  	 *        - `-l`: Print only filenames of matching files
  	 * @param regex_filter The regular expression to use.
  	 * @param files The files to process.
  	 * @return Returns a string containing all lines of the file that match the given regex_filter.
  	 */
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-v`: Inverse the sense of the regex and print
  	 *                the lines not matching the criteria.
  	 *        - `-l`: Print only filenames of matching files
  	 * @param regex_filter The regular expression to use.
  	 * @return Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  def grep(options: String, regex_filter: String, files: js.Array[String]): ShellString = js.native
  def grep(options: String, regex_filter: RegExp, files: String*): ShellString = js.native
  def grep(options: String, regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-v`: Inverse the sense of the regex and print
  	 *                the lines not matching the criteria.
  	 *        - `-l`: Print only filenames of matching files
  	 * @param regex_filter The regular expression to use.
  	 * @return Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  def grep(regex_filter: String, files: String*): ShellString = js.native
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param regex_filter The regular expression to use.
  	 * @param files        The files to process.
  	 * @return             Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-v`: Inverse the sense of the regex and print
  	 *                the lines not matching the criteria.
  	 *        - `-l`: Print only filenames of matching files
  	 * @param regex_filter The regular expression to use.
  	 * @return Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  def grep(regex_filter: String, files: js.Array[String]): ShellString = js.native
  def grep(regex_filter: RegExp, files: String*): ShellString = js.native
  def grep(regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
  /**
  	 * Read the start of a pipeline input.
  	 */
  def head(files: String*): ShellString = js.native
  /**
  	 * Read the start of a pipeline input.
  	 */
  def head(files: js.Array[String]): ShellString = js.native
  /**
  	 * Read the start of a pipeline input.
  	 */
  def head(options: HeadOptions, files: String*): ShellString = js.native
  /**
  	 * Read the start of a pipeline input.
  	 */
  def head(options: HeadOptions, files: js.Array[String]): ShellString = js.native
  /**
  	 * Reads an input string from pipeline and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Replace contents of 'file' in-place. Note that no backups will be created!
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @return            The new string after replacement.
  	 */
  def sed(options: String, searchRegex: String, replacement: String, files: String*): ShellString = js.native
  /**
  	 * Reads an input string from file and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Replace contents of 'file' in-place. Note that no backups will be created!
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @param files       The files to process.
  	 * @return            The new string after replacement.
  	 */
  /**
  	 * Reads an input string from pipeline and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Replace contents of 'file' in-place. Note that no backups will be created!
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @return            The new string after replacement.
  	 */
  def sed(options: String, searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  def sed(options: String, searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  def sed(options: String, searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
  /**
  	 * Reads an input string from pipeline and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Replace contents of 'file' in-place. Note that no backups will be created!
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @return            The new string after replacement.
  	 */
  def sed(searchRegex: String, replacement: String, files: String*): ShellString = js.native
  /**
  	 * Reads an input string from file and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @param files       The files to process.
  	 * @return            The new string after replacement.
  	 */
  /**
  	 * Reads an input string from pipeline and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Replace contents of 'file' in-place. Note that no backups will be created!
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @return            The new string after replacement.
  	 */
  def sed(searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  def sed(searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  def sed(searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
  /**
  	 * Return the contents of the pipeline, sorted line-by-line.
  	 *
  	 * @param options Available options:
  	 *        - `-r`: Reverse the results
  	 *        - `-n`: Compare according to numerical value
  	 */
  def sort(files: String*): ShellString = js.native
  /**
  	 * Return the contents of the files, sorted line-by-line.
  	 * Sorting multiple files mixes their content (just as unix sort does).
  	 */
  /**
  	 * Return the contents of the pipeline, sorted line-by-line.
  	 *
  	 * @param options Available options:
  	 *        - `-r`: Reverse the results
  	 *        - `-n`: Compare according to numerical value
  	 */
  def sort(files: js.Array[String]): ShellString = js.native
  /**
  	 * Return the contents of the pipeline, sorted line-by-line.
  	 *
  	 * @param options Available options:
  	 *        - `-r`: Reverse the results
  	 *        - `-n`: Compare according to numerical value
  	 */
  def sort(options: String, files: String*): ShellString = js.native
  /**
  	 * Return the contents of the files, sorted line-by-line.
  	 * Sorting multiple files mixes their content (just as unix sort does).
  	 *
  	 * @param options Available options:
  	 *        - `-r`: Reverse the results
  	 *        - `-n`: Compare according to numerical value
  	 */
  /**
  	 * Return the contents of the pipeline, sorted line-by-line.
  	 *
  	 * @param options Available options:
  	 *        - `-r`: Reverse the results
  	 *        - `-n`: Compare according to numerical value
  	 */
  def sort(options: String, files: js.Array[String]): ShellString = js.native
  /**
  	 * Read the end of a pipeline input.
  	 */
  def tail(files: String*): ShellString = js.native
  /**
  	 * Read the end of a pipeline input.
  	 */
  def tail(files: js.Array[String]): ShellString = js.native
  /**
  	 * Read the end of a pipeline input.
  	 */
  def tail(options: TailOptions, files: String*): ShellString = js.native
  /**
  	 * Read the end of a pipeline input.
  	 */
  def tail(options: TailOptions, files: js.Array[String]): ShellString = js.native
  /**
  	 * Analogous to the redirection operator `>` in Unix, but works with JavaScript strings
  	 * (such as those returned by `cat`, `grep`, etc).
  	 *
  	 * Like Unix redirections, `to()` will overwrite any existing file!
  	 *
  	 * @param file The file to use.
  	 */
  def to(file: String): Unit = js.native
  /**
  	 * Analogous to the redirect-and-append operator `>>` in Unix, but works with JavaScript strings
  	 * (such as those returned by `cat`, `grep`, etc).
  	 *
  	 * @param file The file to append to.
  	 */
  def toEnd(file: String): Unit = js.native
  /**
  	 * Filter adjacent matching lines from input.
  	 */
  /**
  	 * Filter adjacent matching lines from input.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Ignore case while comparing
  	 *        - `-c`: Prefix lines by the number of occurrences
  	 *        - `-d`: Only print duplicate lines, one for each group of identical lines
  	 */
  def uniq(input: String): ShellString = js.native
  /**
  	 * Filter adjacent matching lines from input.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Ignore case while comparing
  	 *        - `-c`: Prefix lines by the number of occurrences
  	 *        - `-d`: Only print duplicate lines, one for each group of identical lines
  	 */
  def uniq(options: String, input: String): ShellString = js.native
  def uniq(options: String, input: String, output: String): ShellString = js.native
}

