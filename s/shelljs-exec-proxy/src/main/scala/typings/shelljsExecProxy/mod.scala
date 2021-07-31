package typings.shelljsExecProxy

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.shelljs.anon.ExecOptionsasyncfalseunde
import typings.shelljs.anon.ExecOptionsasynctrue
import typings.shelljs.mod.CatFunction
import typings.shelljs.mod.ExecCallback
import typings.shelljs.mod.ExecFunction
import typings.shelljs.mod.ExecOptions
import typings.shelljs.mod.ExecOutputReturnValue
import typings.shelljs.mod.GrepFunction
import typings.shelljs.mod.HeadFunction
import typings.shelljs.mod.HeadOptions
import typings.shelljs.mod.SedFunction
import typings.shelljs.mod.ShellArray
import typings.shelljs.mod.ShellConfig
import typings.shelljs.mod.ShellStringConstructor
import typings.shelljs.mod.SortFunction
import typings.shelljs.mod.TailFunction
import typings.shelljs.mod.TailOptions
import typings.shelljs.mod.TestOptions
import typings.shelljs.mod.TouchOptionsArray
import typings.shelljs.mod.TouchOptionsLiteral
import typings.shelljs.mod.UniqFunction
import typings.shelljsExecProxy.shelljsExecProxyStrings.PlussignN
import typings.shelljsExecProxy.shelljsExecProxyStrings.`-N`
import typings.shelljsExecProxy.shelljsExecProxyStrings.`-c`
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("shelljs-exec-proxy", JSImport.Namespace)
  @js.native
  val ^ : ShelljsExecProxy = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("shelljs-exec-proxy", "ShellString")
  @js.native
  class ShellString protected ()
    extends StObject
       with typings.shelljs.mod.ShellString {
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
    override def cat(files: String*): typings.shelljs.mod.ShellString = js.native
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
    override def cat(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def exec(command: String): typings.shelljs.mod.ShellString = js.native
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
    override def exec(command: String, options: ExecOptionsasyncfalseunde): typings.shelljs.mod.ShellString = js.native
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
    override def exec(command: String, options: ExecOptions): typings.shelljs.mod.ShellString | ChildProcess = js.native
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
    override def grep(options: String, regex_filter: String, files: String*): typings.shelljs.mod.ShellString = js.native
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
    override def grep(options: String, regex_filter: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def grep(options: String, regex_filter: RegExp, files: String*): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def grep(options: String, regex_filter: RegExp, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def grep(regex_filter: String, files: String*): typings.shelljs.mod.ShellString = js.native
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
    override def grep(regex_filter: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def grep(regex_filter: RegExp, files: String*): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def grep(regex_filter: RegExp, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def head(files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Read the start of a pipeline input.
      */
    /* CompleteClass */
    override def head(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    /**
      * Read the start of a pipeline input.
      */
    /* CompleteClass */
    override def head(options: HeadOptions, files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Read the start of a pipeline input.
      */
    /* CompleteClass */
    override def head(options: HeadOptions, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def sed(options: String, searchRegex: String, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
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
    override def sed(options: String, searchRegex: String, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def sed(options: String, searchRegex: RegExp, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def sed(options: String, searchRegex: RegExp, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def sed(searchRegex: String, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
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
    override def sed(searchRegex: String, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def sed(searchRegex: RegExp, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def sed(searchRegex: RegExp, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def sort(files: String*): typings.shelljs.mod.ShellString = js.native
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
    override def sort(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    /**
      * Return the contents of the pipeline, sorted line-by-line.
      *
      * @param options Available options:
      *        - `-r`: Reverse the results
      *        - `-n`: Compare according to numerical value
      */
    /* CompleteClass */
    override def sort(options: String, files: String*): typings.shelljs.mod.ShellString = js.native
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
    override def sort(options: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def tail(files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Read the end of a pipeline input.
      */
    /* CompleteClass */
    override def tail(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    /**
      * Read the end of a pipeline input.
      */
    /* CompleteClass */
    override def tail(options: TailOptions, files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Read the end of a pipeline input.
      */
    /* CompleteClass */
    override def tail(options: TailOptions, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
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
    override def uniq(input: String): typings.shelljs.mod.ShellString = js.native
    /**
      * Filter adjacent matching lines from input.
      *
      * @param options Available options:
      *        - `-i`: Ignore case while comparing
      *        - `-c`: Prefix lines by the number of occurrences
      *        - `-d`: Only print duplicate lines, one for each group of identical lines
      */
    /* CompleteClass */
    override def uniq(options: String, input: String): typings.shelljs.mod.ShellString = js.native
    /* CompleteClass */
    override def uniq(options: String, input: String, output: String): typings.shelljs.mod.ShellString = js.native
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
  
  @js.native
  trait Exec
    extends StObject
       with /* k */ StringDictionary[Exec] {
    
    def apply(command: String*): ExecOutputReturnValue = js.native
  }
  
  @js.native
  trait ShelljsExecProxy
    extends StObject
       with /* k */ StringDictionary[Exec] {
    
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
      * @param value     The string value to wrap.
      * @return                A string-like object with special methods.
      */
    def ShellString(value: String): typings.shelljs.mod.ShellString = js.native
    def ShellString(value: js.Array[String]): ShellArray = js.native
    @JSName("ShellString")
    val ShellString_Original: ShellStringConstructor = js.native
    
    def cat(files: String*): typings.shelljs.mod.ShellString = js.native
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
    def cat(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    def cd(): typings.shelljs.mod.ShellString = js.native
    def cd(dir: String): typings.shelljs.mod.ShellString = js.native
    
    /**
      * Alters the permissions of a file or directory by either specifying the absolute
      * permissions in octal form or expressing the changes in symbols.
      *
      * This command tries to mimic the POSIX behavior as much as possible.
      *
      * Notable exceptions:
      * - In symbolic modes, 'a-r' and '-r' are identical. No consideration is given to the umask.
      * - There is no "quiet" option since default behavior is to run silent.
      *
      * @param mode The access mode. Can be an octal string or a symbolic mode string.
      * @param file The file to use.
      * @return     Object with shell exit code, stderr and stdout.
      */
    def chmod(mode: String, file: String): typings.shelljs.mod.ShellString = js.native
    def chmod(mode: Double, file: String): typings.shelljs.mod.ShellString = js.native
    /**
      * Alters the permissions of a file or directory by either specifying the absolute
      * permissions in octal form or expressing the changes in symbols.
      *
      * This command tries to mimic the POSIX behavior as much as possible.
      *
      * Notable exceptions:
      * - In symbolic modes, 'a-r' and '-r' are identical. No consideration is given to the umask.
      * - There is no "quiet" option since default behavior is to run silent.
      *
      * @param options Available options:
      *        - `-v`: output a diagnostic for every file processed
      *        - `-c`: like -v but report only when a change is made
      *        - `-R`: change files and directories recursively
      * @param mode    The access mode. Can be an octal string or a symbolic mode string.
      * @param file    The file to use.
      * @return        Object with shell exit code, stderr and stdout.
      */
    def chmod(options: String, mode: String, file: String): typings.shelljs.mod.ShellString = js.native
    def chmod(options: String, mode: Double, file: String): typings.shelljs.mod.ShellString = js.native
    
    val config: ShellConfig = js.native
    
    /**
      * Copies files. The wildcard `*` is accepted.
      *
      * @param options Available options:
      *        - `-f`: force (default behavior)
      *        - `-n`: no-clobber
      *        - `-u`: only copy if source is newer than dest
      *        - `-r`, `-R`: recursive
      *        - `-L`: follow symlinks
      *        - `-P`: don't follow symlinks
      * @param source The source.
      * @param dest   The destination.
      * @return       Object with shell exit code, stderr and stdout.
      */
    def cp(options: String, source: String, dest: String): typings.shelljs.mod.ShellString = js.native
    def cp(options: String, source: js.Array[String], dest: String): typings.shelljs.mod.ShellString = js.native
    /**
      * Copies files. The wildcard `*` is accepted.
      *
      * @param source The source.
      * @param dest   The destination.
      * @return       Object with shell exit code, stderr and stdout.
      */
    def cp(source: String, dest: String): typings.shelljs.mod.ShellString = js.native
    def cp(source: js.Array[String], dest: String): typings.shelljs.mod.ShellString = js.native
    
    /**
      * Displays the list of currently remembered directories.
      *
      * @param options Available options:
      *        - `-c`: Clears the directory stack by deleting all of the elements.
      *        - `-N`: Displays the Nth directory (counting from the right of the list
      *                printed by dirs when invoked without options), starting with zero.
      *        - `+N`: Displays the Nth directory (counting from the left of the list
      *                printed by dirs when invoked without options), starting with zero.
      * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
      */
    def dirs(options: String): ShellArray | typings.shelljs.mod.ShellString = js.native
    /**
      * Displays the list of currently remembered directories.
      *
      * @param options Displays the Nth directory (counting from the left of the list
      *                printed by dirs when invoked without options), starting with zero.
      * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
      */
    @JSName("dirs")
    def dirs_N(options: PlussignN): typings.shelljs.mod.ShellString = js.native
    /**
      * Displays the list of currently remembered directories.
      *
      * @param options Displays the Nth directory (counting from the right of the list
      *                printed by dirs when invoked without options), starting with zero.
      * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
      */
    @JSName("dirs")
    def dirs_N(options: `-N`): typings.shelljs.mod.ShellString = js.native
    /**
      * Clears the directory stack by deleting all of the elements.
      *
      * @param options Clears the directory stack by deleting all of the elements.
      * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
      */
    @JSName("dirs")
    def dirs_c(options: `-c`): ShellArray = js.native
    
    /**
      * Prints string to stdout, and returns string with additional utility methods like .to().
      *
      * @param options Available options:
      *        - `-e`: interpret backslash escapes (default)
      *        - `-n`: remove trailing newline from output
      * @param text The text to print.
      * @return     Returns the string that was passed as argument.
      */
    def echo(options: String, text: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Prints string to stdout, and returns string with additional utility methods like .to().
      *
      * @param text The text to print.
      * @return     Returns the string that was passed as argument.
      */
    def echo(text: String*): typings.shelljs.mod.ShellString = js.native
    
    val env: ProcessEnv = js.native
    
    def error(): typings.shelljs.mod.ShellString = js.native
    
    /**
      * Executes the given command synchronously.
      *
      * @param command The command to execute.
      * @return        Returns an object containing the return code and output as string.
      */
    def exec(command: String): typings.shelljs.mod.ShellString = js.native
    /**
      * Executes the given command synchronously.
      *
      * @param command The command to execute.
      * @param callback Receives code and output asynchronously.
      */
    def exec(command: String, callback: ExecCallback): ChildProcess = js.native
    /**
      * Executes the given command synchronously.
      *
      * @param command The command to execute.
      * @param options Silence and synchronous options.
      * @return        Returns an object containing the return code and output as string,
      *                or if `{async: true}` was passed, a `ChildProcess`.
      */
    def exec(command: String, options: ExecOptionsasyncfalseunde): typings.shelljs.mod.ShellString = js.native
    /**
      * Executes the given command asynchronously.
      *
      * @param command The command to execute.
      * @param options Silence and synchronous options.
      * @return        Returns an object containing the return code and output as string,
      *                or if `{async: true}` was passed, a `ChildProcess`.
      */
    def exec(command: String, options: ExecOptionsasynctrue): ChildProcess = js.native
    /**
      * Executes the given command.
      *
      * @param command The command to execute.
      * @param options Silence and synchronous options.
      * @return        Returns an object containing the return code and output as string,
      *                or if `{async: true}` was passed, a `ChildProcess`.
      */
    def exec(command: String, options: ExecOptions): typings.shelljs.mod.ShellString | ChildProcess = js.native
    /**
      * Executes the given command synchronously.
      *
      * @param command The command to execute.
      * @param options Silence and synchronous options.
      * @param callback Receives code and output asynchronously.
      */
    def exec(command: String, options: ExecOptions, callback: ExecCallback): ChildProcess = js.native
    
    def exit(): scala.Nothing = js.native
    def exit(code: Double): scala.Nothing = js.native
    
    def find(path: String*): ShellArray = js.native
    /**
      * Returns array of all files (however deep) in the given paths.
      *
      * @param path The path(s) to search.
      * @return     An array of all files (however deep) in the given path(s).
      */
    def find(path: js.Array[String]): ShellArray = js.native
    
    def grep(options: String, regex_filter: String, files: String*): typings.shelljs.mod.ShellString = js.native
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
    def grep(options: String, regex_filter: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def grep(options: String, regex_filter: RegExp, files: String*): typings.shelljs.mod.ShellString = js.native
    def grep(options: String, regex_filter: RegExp, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def grep(regex_filter: String, files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Reads input string from given files and returns a string containing all lines
      * of the file that match the given `regex_filter`. Wildcard `*` accepted.
      *
      * @param regex_filter The regular expression to use.
      * @param files        The files to process.
      * @return             Returns a string containing all lines of the file that match the given `regex_filter`.
      */
    def grep(regex_filter: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def grep(regex_filter: RegExp, files: String*): typings.shelljs.mod.ShellString = js.native
    def grep(regex_filter: RegExp, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    def head(files: String*): typings.shelljs.mod.ShellString = js.native
    def head(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def head(options: HeadOptions, files: String*): typings.shelljs.mod.ShellString = js.native
    def head(options: HeadOptions, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    /**
      * Links source to dest. Use `-f` to force the link, should dest already exist.
      *
      * @param options Available options:
      *        - `-s`: Create a symbolic link, defaults to a hardlink
      *        - `-f`: Force creation
      * @param source The source.
      * @param dest   The destination.
      * @return       Object with shell exit code, stderr and stdout.
      */
    def ln(options: String, source: String, dest: String): typings.shelljs.mod.ShellString = js.native
    /**
      * Links source to dest. Use `-f` to force the link, should dest already exist.
      *
      * @param source The source.
      * @param dest   The destination.
      * @return       Object with shell exit code, stderr and stdout.
      */
    def ln(source: String, dest: String): typings.shelljs.mod.ShellString = js.native
    
    def ls(options: String, paths: String*): ShellArray = js.native
    /**
      * Returns array of files in the given path, or in current directory if no path provided.
      *
      * @param options Available options:
      *        - `-R`: recursive
      *        - `-A`: all files (include files beginning with ., except for . and ..)
      *        - `-L`: follow symlinks
      *        - `-d`: list directories themselves, not their contents
      *        - `-l`: list objects representing each file, each with fields containing
      *                `ls -l` output fields. See fs.Stats for more info
      * @param paths   Paths to search.
      * @return        An array of files in the given path(s).
      */
    def ls(options: String, paths: js.Array[String]): ShellArray = js.native
    def ls(paths: String*): ShellArray = js.native
    /**
      * Returns array of files in the given path, or in current directory if no path provided.
      *
      * @param paths Paths to search.
      * @return      An array of files in the given path(s).
      */
    def ls(paths: js.Array[String]): ShellArray = js.native
    
    def mkdir(dir: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Creates directories.
      *
      * @param dir Directories to create.
      * @return    Object with shell exit code, stderr and stdout.
      */
    def mkdir(dir: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def mkdir(options: String, dir: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Creates directories.
      *
      * @param options Available options:
      *        - `-p`: full paths, will create intermediate dirs if necessary
      * @param dir     The directories to create.
      * @return        Object with shell exit code, stderr and stdout.
      */
    def mkdir(options: String, dir: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    /**
      * Moves files. The wildcard `*` is accepted.
      *
      * @param options Available options:
      *        - `-f`: force (default behavior)
      *        - `-n`: no-clobber
      * @param source The source.
      * @param dest   The destination.
      * @return       Object with shell exit code, stderr and stdout.
      */
    def mv(options: String, source: String, dest: String): typings.shelljs.mod.ShellString = js.native
    def mv(options: String, source: js.Array[String], dest: String): typings.shelljs.mod.ShellString = js.native
    /**
      * Moves files. The wildcard `*` is accepted.
      *
      * @param source The source.
      * @param dest   The destination.
      * @return       Object with shell exit code, stderr and stdout.
      */
    def mv(source: String, dest: String): typings.shelljs.mod.ShellString = js.native
    def mv(source: js.Array[String], dest: String): typings.shelljs.mod.ShellString = js.native
    
    /**
      * When no arguments are given, popd removes the top directory from the stack
      * and performs a `cd` to the new top directory.
      *
      * The elements are numbered from 0 starting at the first directory listed with dirs;
      * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
      *
      * @return     Returns an array of paths in the stack.
      */
    def popd(): ShellArray = js.native
    /**
      * When no arguments are given, popd removes the top directory from the stack
      * and performs a `cd` to the new top directory.
      *
      * The elements are numbered from 0 starting at the first directory listed with dirs;
      * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
      *
      * @param dir You can only use -N and +N.
      * @return    Returns an array of paths in the stack.
      */
    def popd(dir: String): ShellArray = js.native
    /**
      * When no arguments are given, popd removes the top directory from the stack
      * and performs a `cd` to the new top directory.
      *
      * The elements are numbered from 0 starting at the first directory listed with dirs;
      * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
      *
      * @param options Available options:
      *        - `-n`: Suppresses the normal change of directory when removing directories
      *                from the stack, so that only the stack is manipulated
      *        - `-q`: Suppresses output to the console.
      * @param dir     You can only use -N and +N.
      * @return        Returns an array of paths in the stack.
      */
    def popd(options: String, dir: String): ShellArray = js.native
    /**
      * When no arguments are given, popd removes the top directory from the stack
      * and performs a `cd` to the new top directory.
      *
      * The elements are numbered from 0 starting at the first directory listed with dirs;
      * i.e., popd is equivalent to popd +0. Returns an array of paths in the stack.
      *
      * @param dir Removes the Nth directory (counting from the left of the list printed by dirs), starting with zero.
      * @return    Returns an array of paths in the stack.
      */
    @JSName("popd")
    def popd_N(dir: PlussignN): ShellArray = js.native
    /**
      * When no arguments are given, popd removes the top directory from the stack
      * and performs a `cd` to the new top directory.
      *
      * The elements are numbered from 0 starting at the first directory listed with dirs;
      * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
      *
      * @param dir Removes the Nth directory (counting from the right of the list printed by dirs), starting with zero.
      * @return    Returns an array of paths in the stack.
      */
    @JSName("popd")
    def popd_N(dir: `-N`): ShellArray = js.native
    /**
      * When no arguments are given, popd removes the top directory from the stack
      * and performs a `cd` to the new top directory.
      *
      * The elements are numbered from 0 starting at the first directory listed with dirs;
      * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
      *
      * @param options Available options:
      *        - `-n`: Suppresses the normal change of directory when removing directories
      *                from the stack, so that only the stack is manipulated
      *        - `-q`: Suppresses output to the console.
      * @param dir     Removes the Nth directory (counting from the left of the list printed by dirs), starting with zero.
      * @return        Returns an array of paths in the stack.
      */
    @JSName("popd")
    def popd_N(options: String, dir: PlussignN): ShellArray = js.native
    /**
      * When no arguments are given, popd removes the top directory from the stack
      * and performs a `cd` to the new top directory.
      *
      * The elements are numbered from 0 starting at the first directory listed with dirs;
      * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
      *
      * @param options Available options:
      *        - `-n`: Suppresses the normal change of directory when removing directories
      *                from the stack, so that only the stack is manipulated
      *        - `-q`: Suppresses output to the console.
      * @param dir     Removes the Nth directory (counting from the right of the list printed by dirs), starting with zero.
      * @return        Returns an array of paths in the stack.
      */
    @JSName("popd")
    def popd_N(options: String, dir: `-N`): ShellArray = js.native
    
    /**
      * Saves the current directory on the top of the directory stack and then cd to dir.
      * With no arguments, `pushd` exchanges the top two directories.
      *
      * @return Returns an array of paths in the stack.
      */
    def pushd(): ShellArray = js.native
    /**
      * Saves the current directory on the top of the directory stack and then cd to dir.
      * With no arguments, `pushd` exchanges the top two directories.
      *
      * @param dir Makes the current working directory be the top of the stack,
      *            and then executes the equivalent of cd dir.
      * @return    Returns an array of paths in the stack.
      */
    def pushd(dir: String): ShellArray = js.native
    /**
      * Saves the current directory on the top of the directory stack and then cd to dir.
      * With no arguments, `pushd` exchanges the top two directories.
      *
      * @param options Available options:
      *        - `-n`: Suppresses the normal change of directory when adding directories
      *                to the stack, so that only the stack is manipulated
      *        - `-q`: Suppresses output to the console.
      * @param dir     Makes the current working directory be the top of the stack,
      *                and then executes the equivalent of `cd dir`.
      * @return        Returns an array of paths in the stack.
      */
    def pushd(options: String, dir: String): ShellArray = js.native
    /**
      * Saves the current directory on the top of the directory stack and then cd to dir.
      * With no arguments, `pushd` exchanges the top two directories.
      *
      * @param dir Brings the Nth directory (counting from the left of the list printed by dirs,
      *            starting with zero) to the top of the list by rotating the stack.
      * @return    Returns an array of paths in the stack.
      */
    @JSName("pushd")
    def pushd_N(dir: PlussignN): ShellArray = js.native
    /**
      * Saves the current directory on the top of the directory stack and then cd to dir.
      * With no arguments, `pushd` exchanges the top two directories.
      *
      * @param dir Brings the Nth directory (counting from the right of the list printed by dirs,
      *            starting with zero) to the top of the list by rotating the stack.
      * @return    Returns an array of paths in the stack.
      */
    @JSName("pushd")
    def pushd_N(dir: `-N`): ShellArray = js.native
    /**
      * Saves the current directory on the top of the directory stack and then cd to dir.
      * With no arguments, `pushd` exchanges the top two directories.
      *
      * @param options Available options:
      *        - `-n`: Suppresses the normal change of directory when adding directories
      *                to the stack, so that only the stack is manipulated
      *        - `-q`: Suppresses output to the console.
      * @param dir     Brings the Nth directory (counting from the left of the list printed by dirs,
      *                starting with zero) to the top of the list by rotating the stack.
      * @return        Returns an array of paths in the stack.
      */
    @JSName("pushd")
    def pushd_N(options: String, dir: PlussignN): ShellArray = js.native
    /**
      * Saves the current directory on the top of the directory stack and then cd to dir.
      * With no arguments, `pushd` exchanges the top two directories.
      *
      * @param options Available options:
      *        - `-n`: Suppresses the normal change of directory when adding directories
      *                to the stack, so that only the stack is manipulated
      *        - `-q`: Suppresses output to the console.
      * @param dir     Brings the Nth directory (counting from the right of the list printed by dirs,
      *                starting with zero) to the top of the list by rotating the stack.
      * @return        Returns an array of paths in the stack.
      */
    @JSName("pushd")
    def pushd_N(options: String, dir: `-N`): ShellArray = js.native
    
    def pwd(): typings.shelljs.mod.ShellString = js.native
    
    def rm(files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Removes files. The wildcard `*` is accepted.
      *
      * @param files Files to remove.
      * @return      Object with shell exit code, stderr and stdout.
      */
    def rm(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def rm(options: String, files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Removes files. The wildcard `*` is accepted.
      *
      * @param options Available options:
      *        - `-f`: force
      *        - `-r`, `-R`: recursive
      * @param files   Files to remove.
      * @return        Object with shell exit code, stderr and stdout.
      */
    def rm(options: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    def sed(options: String, searchRegex: String, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
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
    def sed(options: String, searchRegex: String, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def sed(options: String, searchRegex: RegExp, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
    def sed(options: String, searchRegex: RegExp, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def sed(searchRegex: String, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Reads an input string from file and performs a JavaScript `replace()`
      * on the input using the given search regex and replacement string or function.
      *
      * @param searchRegex The regular expression to use for search.
      * @param replacement The replacement.
      * @param files       The files to process.
      * @return            The new string after replacement.
      */
    def sed(searchRegex: String, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def sed(searchRegex: RegExp, replacement: String, files: String*): typings.shelljs.mod.ShellString = js.native
    def sed(searchRegex: RegExp, replacement: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    def set(options: String): Unit = js.native
    
    def sort(files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Return the contents of the files, sorted line-by-line.
      * Sorting multiple files mixes their content (just as unix sort does).
      */
    def sort(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def sort(options: String, files: String*): typings.shelljs.mod.ShellString = js.native
    /**
      * Return the contents of the files, sorted line-by-line.
      * Sorting multiple files mixes their content (just as unix sort does).
      *
      * @param options Available options:
      *        - `-r`: Reverse the results
      *        - `-n`: Compare according to numerical value
      */
    def sort(options: String, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    def tail(files: String*): typings.shelljs.mod.ShellString = js.native
    def tail(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def tail(options: TailOptions, files: String*): typings.shelljs.mod.ShellString = js.native
    def tail(options: TailOptions, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    def tempdir(): typings.shelljs.mod.ShellString = js.native
    
    def test(option: TestOptions, path: String): Boolean = js.native
    
    def touch(files: String*): typings.shelljs.mod.ShellString = js.native
    def touch(files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def touch(options: TouchOptionsArray, files: String*): typings.shelljs.mod.ShellString = js.native
    def touch(options: TouchOptionsArray, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    def touch(options: TouchOptionsLiteral, files: String*): typings.shelljs.mod.ShellString = js.native
    def touch(options: TouchOptionsLiteral, files: js.Array[String]): typings.shelljs.mod.ShellString = js.native
    
    /**
      * Filter adjacent matching lines from input.
      */
    def uniq(input: String): typings.shelljs.mod.ShellString = js.native
    /**
      * Filter adjacent matching lines from input.
      *
      * @param options Available options:
      *        - `-i`: Ignore case while comparing
      *        - `-c`: Prefix lines by the number of occurrences
      *        - `-d`: Only print duplicate lines, one for each group of identical lines
      */
    def uniq(options: String, input: String): typings.shelljs.mod.ShellString = js.native
    def uniq(options: String, input: String, output: String): typings.shelljs.mod.ShellString = js.native
    
    def which(command: String): typings.shelljs.mod.ShellString = js.native
  }
  
  type _To = ShelljsExecProxy
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ShelljsExecProxy = ^
}
