package typings.shelljs

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.shelljs.anon.ExecOptionsasyncfalseunde
import typings.shelljs.anon.ExecOptionsasynctrue
import typings.shelljs.mod.CatFunction
import typings.shelljs.mod.ChmodFunction
import typings.shelljs.mod.CopyFunction
import typings.shelljs.mod.DirsFunction
import typings.shelljs.mod.EchoFunction
import typings.shelljs.mod.ExecCallback
import typings.shelljs.mod.ExecFunction
import typings.shelljs.mod.ExecOptions
import typings.shelljs.mod.FindFunction
import typings.shelljs.mod.GrepFunction
import typings.shelljs.mod.HeadFunction
import typings.shelljs.mod.HeadOptions
import typings.shelljs.mod.LinkFunction
import typings.shelljs.mod.ListFunction
import typings.shelljs.mod.MkdirFunction
import typings.shelljs.mod.MoveFunction
import typings.shelljs.mod.PopDirFunction
import typings.shelljs.mod.PushDirFunction
import typings.shelljs.mod.RemoveFunction
import typings.shelljs.mod.SedFunction
import typings.shelljs.mod.ShellConfig
import typings.shelljs.mod.ShellStringConstructor
import typings.shelljs.mod.SortFunction
import typings.shelljs.mod.TailFunction
import typings.shelljs.mod.TailOptions
import typings.shelljs.mod.TouchFunction
import typings.shelljs.mod.UniqFunction
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeMod {
  
  object global {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ShellString")
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
    /* was `typeof shelljs.ShellString` */
    @JSGlobal("ShellString")
    @js.native
    val ShellString: ShellStringConstructor = js.native
    
    /* was `typeof shelljs.cat` */
    @JSGlobal("cat")
    @js.native
    val cat: CatFunction = js.native
    
    /* was `typeof shelljs.cd` */
    inline def cd(): typings.shelljs.mod.ShellString = js.Dynamic.global.applyDynamic("cd")().asInstanceOf[typings.shelljs.mod.ShellString]
    inline def cd(dir: String): typings.shelljs.mod.ShellString = js.Dynamic.global.applyDynamic("cd")(dir.asInstanceOf[js.Any]).asInstanceOf[typings.shelljs.mod.ShellString]
    
    /* was `typeof shelljs.chmod` */
    @JSGlobal("chmod")
    @js.native
    val chmod: ChmodFunction = js.native
    
    /* was `typeof shelljs.config` */
    @JSGlobal("config")
    @js.native
    val config: ShellConfig = js.native
    
    /* was `typeof shelljs.cp` */
    @JSGlobal("cp")
    @js.native
    val cp: CopyFunction = js.native
    
    /* was `typeof shelljs.dirs` */
    @JSGlobal("dirs")
    @js.native
    val dirs: DirsFunction = js.native
    
    /* was `typeof shelljs.echo` */
    @JSGlobal("echo")
    @js.native
    val echo: EchoFunction = js.native
    
    /* was `typeof shelljs.env` */
    @JSGlobal("env")
    @js.native
    val env: ProcessEnv = js.native
    
    /* was `typeof shelljs.error` */
    inline def error(): typings.shelljs.mod.ShellString = js.Dynamic.global.applyDynamic("error")().asInstanceOf[typings.shelljs.mod.ShellString]
    
    /* was `typeof shelljs.exec` */
    @JSGlobal("exec")
    @js.native
    val exec: ExecFunction = js.native
    
    /* was `typeof shelljs.exit` */
    inline def exit(): scala.Nothing = js.Dynamic.global.applyDynamic("exit")().asInstanceOf[scala.Nothing]
    inline def exit(code: Double): scala.Nothing = js.Dynamic.global.applyDynamic("exit")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    
    /* was `typeof shelljs.find` */
    @JSGlobal("find")
    @js.native
    val find: FindFunction = js.native
    
    /* was `typeof shelljs.grep` */
    @JSGlobal("grep")
    @js.native
    val grep: GrepFunction = js.native
    
    /* was `typeof shelljs.head` */
    @JSGlobal("head")
    @js.native
    val head: HeadFunction = js.native
    
    /* was `typeof shelljs.ln` */
    @JSGlobal("ln")
    @js.native
    val ln: LinkFunction = js.native
    
    /* was `typeof shelljs.ls` */
    @JSGlobal("ls")
    @js.native
    val ls: ListFunction = js.native
    
    /* was `typeof shelljs.mkdir` */
    @JSGlobal("mkdir")
    @js.native
    val mkdir: MkdirFunction = js.native
    
    /* was `typeof shelljs.mv` */
    @JSGlobal("mv")
    @js.native
    val mv: MoveFunction = js.native
    
    /* was `typeof shelljs.popd` */
    @JSGlobal("popd")
    @js.native
    val popd: PopDirFunction = js.native
    
    /* was `typeof shelljs.pushd` */
    @JSGlobal("pushd")
    @js.native
    val pushd: PushDirFunction = js.native
    
    /* was `typeof shelljs.pwd` */
    inline def pwd(): typings.shelljs.mod.ShellString = js.Dynamic.global.applyDynamic("pwd")().asInstanceOf[typings.shelljs.mod.ShellString]
    
    /* was `typeof shelljs.rm` */
    @JSGlobal("rm")
    @js.native
    val rm: RemoveFunction = js.native
    
    /* was `typeof shelljs.sed` */
    @JSGlobal("sed")
    @js.native
    val sed: SedFunction = js.native
    
    /* was `typeof shelljs.set` */
    inline def set(options: String): Unit = js.Dynamic.global.applyDynamic("set")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof shelljs.sort` */
    @JSGlobal("sort")
    @js.native
    val sort: SortFunction = js.native
    
    /* was `typeof shelljs.tail` */
    @JSGlobal("tail")
    @js.native
    val tail: TailFunction = js.native
    
    object target {
      
      @JSGlobal("target")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("target.all")
      @js.native
      def all: js.UndefOr[Target_] = js.native
      inline def all_=(x: js.UndefOr[Target_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    }
    
    /* was `typeof shelljs.tempdir` */
    inline def tempdir(): typings.shelljs.mod.ShellString = js.Dynamic.global.applyDynamic("tempdir")().asInstanceOf[typings.shelljs.mod.ShellString]
    
    /* was `typeof shelljs.touch` */
    @JSGlobal("touch")
    @js.native
    val touch: TouchFunction = js.native
    
    /* was `typeof shelljs.uniq` */
    @JSGlobal("uniq")
    @js.native
    val uniq: UniqFunction = js.native
    
    @js.native
    trait Target_ extends StObject {
      
      def apply(args: js.Any*): Unit = js.native
      
      var done: js.UndefOr[Boolean] = js.native
      
      var result: js.UndefOr[js.Any] = js.native
    }
  }
}
