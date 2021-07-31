package typings.shelljs.mod

import typings.node.childProcessMod.ChildProcess
import typings.shelljs.anon.ExecOptionsasyncfalseunde
import typings.shelljs.anon.ExecOptionsasynctrue
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("shelljs", "ShellString")
@js.native
class ShellStringCls protected ()
  extends StObject
     with ShellString {
  /**
    * Wraps a string (or array) value. This has all the string (or array) methods,
    * but also exposes extra methods: `.to()`, `.toEnd()`, and all the pipe-able
    * methods (ex. `.cat()`, `.grep()`, etc.).
    *
    * This can be easily converted into a string by calling `.toString()`.
    *
    * This type also exposes the corresponding command's stdout, stderr, and return status
    * code via the `.stdout` (string), `.stderr` (string), and `.code` (number) properties
    * respectively.
    *
    * Construct signature allows for:
    *
    * var foo = new ShellString('hello world');
    *
    * as per example in shelljs docs:
    * https://github.com/shelljs/shelljs#shellstringstr
    *
    * @param value     The string value to wrap.
    * @return                A string-like object with special methods.
    */
  def this(value: String) = this()
  
  /**
    * Returns a string containing the given pipeline, or a concatenated string
    * containing the pipelines if more than one input stream is given
    * (a new line character is introduced between each input).
    *
    * @return A string containing the given pipeline, or a concatenated string
    *         containing the pipelines if more than one input stream is given
    *         (a new line character is introduced between each input).
    */
  /* CompleteClass */
  override def cat(files: String*): ShellString = js.native
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
  /* CompleteClass */
  override def cat(files: js.Array[String]): ShellString = js.native
  /**
    * Returns a string containing the given pipeline, or a concatenated string
    * containing the pipelines if more than one input stream is given
    * (a new line character is introduced between each input).
    *
    * @return A string containing the given pipeline, or a concatenated string
    *         containing the pipelines if more than one input stream is given
    *         (a new line character is introduced between each input).
    */
  /* CompleteClass */
  @JSName("cat")
  var cat_Original: CatFunction = js.native
  
  /** The process exit code. */
  /* CompleteClass */
  var code: Double = js.native
  
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
  /* CompleteClass */
  override def exec(command: String): ShellString = js.native
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
  /* CompleteClass */
  override def exec(command: String, callback: ExecCallback): ChildProcess = js.native
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
  /* CompleteClass */
  override def exec(command: String, options: ExecOptionsasyncfalseunde): ShellString = js.native
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
  /* CompleteClass */
  override def exec(command: String, options: ExecOptionsasynctrue): ChildProcess = js.native
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
  /* CompleteClass */
  override def exec(command: String, options: ExecOptions): ShellString | ChildProcess = js.native
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
  /* CompleteClass */
  override def exec(command: String, options: ExecOptions, callback: ExecCallback): ChildProcess = js.native
  /**
    * Executes the given command.
    *
    * @param command The command to execute.
    * @param options Silence and synchronous options.
    * @param [callback] Receives code and output asynchronously.
    * @return Returns an object containing the return code and output as string,
    *         or if `{async: true}` or a `callback` was passed, a `ChildProcess`.
    */
  /* CompleteClass */
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
  /* CompleteClass */
  override def grep(options: String, regex_filter: String, files: String*): ShellString = js.native
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
  /* CompleteClass */
  override def grep(options: String, regex_filter: String, files: js.Array[String]): ShellString = js.native
  /* CompleteClass */
  override def grep(options: String, regex_filter: RegExp, files: String*): ShellString = js.native
  /* CompleteClass */
  override def grep(options: String, regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
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
  /* CompleteClass */
  override def grep(regex_filter: String, files: String*): ShellString = js.native
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
  /* CompleteClass */
  override def grep(regex_filter: String, files: js.Array[String]): ShellString = js.native
  /* CompleteClass */
  override def grep(regex_filter: RegExp, files: String*): ShellString = js.native
  /* CompleteClass */
  override def grep(regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
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
  /* CompleteClass */
  @JSName("grep")
  var grep_Original: GrepFunction = js.native
  
  /**
    * Read the start of a pipeline input.
    */
  /* CompleteClass */
  override def head(files: String*): ShellString = js.native
  /**
    * Read the start of a pipeline input.
    */
  /* CompleteClass */
  override def head(files: js.Array[String]): ShellString = js.native
  /**
    * Read the start of a pipeline input.
    */
  /* CompleteClass */
  override def head(options: HeadOptions, files: String*): ShellString = js.native
  /**
    * Read the start of a pipeline input.
    */
  /* CompleteClass */
  override def head(options: HeadOptions, files: js.Array[String]): ShellString = js.native
  /**
    * Read the start of a pipeline input.
    */
  /* CompleteClass */
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
  /* CompleteClass */
  override def sed(options: String, searchRegex: String, replacement: String, files: String*): ShellString = js.native
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
  /* CompleteClass */
  override def sed(options: String, searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  /* CompleteClass */
  override def sed(options: String, searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  /* CompleteClass */
  override def sed(options: String, searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
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
  /* CompleteClass */
  override def sed(searchRegex: String, replacement: String, files: String*): ShellString = js.native
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
  /* CompleteClass */
  override def sed(searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  /* CompleteClass */
  override def sed(searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  /* CompleteClass */
  override def sed(searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
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
  /* CompleteClass */
  @JSName("sed")
  var sed_Original: SedFunction = js.native
  
  /**
    * Return the contents of the pipeline, sorted line-by-line.
    *
    * @param options Available options:
    *        - `-r`: Reverse the results
    *        - `-n`: Compare according to numerical value
    */
  /* CompleteClass */
  override def sort(files: String*): ShellString = js.native
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
  /* CompleteClass */
  override def sort(files: js.Array[String]): ShellString = js.native
  /**
    * Return the contents of the pipeline, sorted line-by-line.
    *
    * @param options Available options:
    *        - `-r`: Reverse the results
    *        - `-n`: Compare according to numerical value
    */
  /* CompleteClass */
  override def sort(options: String, files: String*): ShellString = js.native
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
  /* CompleteClass */
  override def sort(options: String, files: js.Array[String]): ShellString = js.native
  /**
    * Return the contents of the pipeline, sorted line-by-line.
    *
    * @param options Available options:
    *        - `-r`: Reverse the results
    *        - `-n`: Compare according to numerical value
    */
  /* CompleteClass */
  @JSName("sort")
  var sort_Original: SortFunction = js.native
  
  /** The process standard error output. */
  /* CompleteClass */
  var stderr: String = js.native
  
  /** The process standard output. */
  /* CompleteClass */
  var stdout: String = js.native
  
  /**
    * Read the end of a pipeline input.
    */
  /* CompleteClass */
  override def tail(files: String*): ShellString = js.native
  /**
    * Read the end of a pipeline input.
    */
  /* CompleteClass */
  override def tail(files: js.Array[String]): ShellString = js.native
  /**
    * Read the end of a pipeline input.
    */
  /* CompleteClass */
  override def tail(options: TailOptions, files: String*): ShellString = js.native
  /**
    * Read the end of a pipeline input.
    */
  /* CompleteClass */
  override def tail(options: TailOptions, files: js.Array[String]): ShellString = js.native
  /**
    * Read the end of a pipeline input.
    */
  /* CompleteClass */
  @JSName("tail")
  var tail_Original: TailFunction = js.native
  
  /**
    * Analogous to the redirection operator `>` in Unix, but works with JavaScript strings
    * (such as those returned by `cat`, `grep`, etc).
    *
    * Like Unix redirections, `to()` will overwrite any existing file!
    *
    * @param file The file to use.
    */
  /* CompleteClass */
  override def to(file: String): Unit = js.native
  
  /**
    * Analogous to the redirect-and-append operator `>>` in Unix, but works with JavaScript strings
    * (such as those returned by `cat`, `grep`, etc).
    *
    * @param file The file to append to.
    */
  /* CompleteClass */
  override def toEnd(file: String): Unit = js.native
  
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
  /* CompleteClass */
  override def uniq(input: String): ShellString = js.native
  /**
    * Filter adjacent matching lines from input.
    *
    * @param options Available options:
    *        - `-i`: Ignore case while comparing
    *        - `-c`: Prefix lines by the number of occurrences
    *        - `-d`: Only print duplicate lines, one for each group of identical lines
    */
  /* CompleteClass */
  override def uniq(options: String, input: String): ShellString = js.native
  /* CompleteClass */
  override def uniq(options: String, input: String, output: String): ShellString = js.native
  /**
    * Filter adjacent matching lines from input.
    *
    * @param options Available options:
    *        - `-i`: Ignore case while comparing
    *        - `-c`: Prefix lines by the number of occurrences
    *        - `-d`: Only print duplicate lines, one for each group of identical lines
    */
  /* CompleteClass */
  @JSName("uniq")
  var uniq_Original: UniqFunction = js.native
}
