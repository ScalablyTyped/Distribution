package typings.shelljsExecProxy.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ProcessEnv
import typings.node.childProcessMod.ChildProcess
import typings.shelljs.anon.ExecOptionsasyncfalse
import typings.shelljs.anon.ExecOptionsasynctrue
import typings.shelljs.mod.ExecCallback
import typings.shelljs.mod.ExecOptions
import typings.shelljs.mod.HeadOptions
import typings.shelljs.mod.ShellArray
import typings.shelljs.mod.ShellConfig
import typings.shelljs.mod.ShellString
import typings.shelljs.mod.ShellStringConstructor
import typings.shelljs.mod.TailOptions
import typings.shelljs.mod.TestOptions
import typings.shelljs.mod.TouchOptionsArray
import typings.shelljs.mod.TouchOptionsLiteral
import typings.shelljsExecProxy.shelljsExecProxyStrings.PlussignN
import typings.shelljsExecProxy.shelljsExecProxyStrings.`-N`
import typings.shelljsExecProxy.shelljsExecProxyStrings.`-c`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[k: string] : shelljs-exec-proxy.shelljs-exec-proxy.Exec} & { readonly head  :shelljs.shelljs.HeadFunction, readonly exit (): never, readonly exit (code : number): never,  readonly env  :node.NodeJS.ProcessEnv,  readonly popd  :shelljs.shelljs.PopDirFunction,  readonly grep  :shelljs.shelljs.GrepFunction,  readonly pushd  :shelljs.shelljs.PushDirFunction,  readonly sort  :shelljs.shelljs.SortFunction,  readonly sed  :shelljs.shelljs.SedFunction,  readonly chmod  :shelljs.shelljs.ChmodFunction, readonly error (): shelljs.shelljs.ShellString, readonly which (command : string): shelljs.shelljs.ShellString,  readonly mv  :shelljs.shelljs.MoveFunction,  readonly touch  :shelljs.shelljs.TouchFunction,  readonly uniq  :shelljs.shelljs.UniqFunction,  readonly ls  :shelljs.shelljs.ListFunction,  readonly ln  :shelljs.shelljs.LinkFunction,  readonly echo  :shelljs.shelljs.EchoFunction,  readonly rm  :shelljs.shelljs.RemoveFunction,  readonly find  :shelljs.shelljs.FindFunction,  readonly cat  :shelljs.shelljs.CatFunction,  readonly dirs  :shelljs.shelljs.DirsFunction,  readonly mkdir  :shelljs.shelljs.MkdirFunction, readonly tempdir (): shelljs.shelljs.ShellString,  readonly tail  :shelljs.shelljs.TailFunction,  readonly exec  :shelljs.shelljs.ExecFunction,  readonly cp  :shelljs.shelljs.CopyFunction,  readonly ShellString  :shelljs.shelljs.ShellStringConstructor, readonly test (option : shelljs.shelljs.TestOptions, path : string): boolean,  readonly config  :shelljs.shelljs.ShellConfig, readonly set (options : string): void, readonly cd (): shelljs.shelljs.ShellString, readonly cd (dir : string): shelljs.shelljs.ShellString, readonly pwd (): shelljs.shelljs.ShellString} */
@js.native
trait ShelljsExecProxy extends /* k */ StringDictionary[Exec] {
  @JSName("ShellString")
  val ShellString_Original: ShellStringConstructor = js.native
  val config: ShellConfig = js.native
  val env: ProcessEnv = js.native
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
  def cat(files: js.Array[String]): ShellString = js.native
  def cd(): ShellString = js.native
  def cd(dir: String): ShellString = js.native
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
  def chmod(mode: String, file: String): ShellString = js.native
  def chmod(mode: Double, file: String): ShellString = js.native
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
  def chmod(options: String, mode: String, file: String): ShellString = js.native
  def chmod(options: String, mode: Double, file: String): ShellString = js.native
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
  def cp(options: String, source: String, dest: String): ShellString = js.native
  def cp(options: String, source: js.Array[String], dest: String): ShellString = js.native
  /**
    * Copies files. The wildcard `*` is accepted.
    *
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def cp(source: String, dest: String): ShellString = js.native
  def cp(source: js.Array[String], dest: String): ShellString = js.native
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
  def dirs(options: String): ShellArray | ShellString = js.native
  /**
    * Displays the list of currently remembered directories.
    *
    * @param options Displays the Nth directory (counting from the left of the list
    *                printed by dirs when invoked without options), starting with zero.
    * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
    */
  @JSName("dirs")
  def dirs_N(options: PlussignN): ShellString = js.native
  /**
    * Displays the list of currently remembered directories.
    *
    * @param options Displays the Nth directory (counting from the right of the list
    *                printed by dirs when invoked without options), starting with zero.
    * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
    */
  @JSName("dirs")
  def dirs_N(options: `-N`): ShellString = js.native
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
  def echo(options: String, text: String*): ShellString = js.native
  /**
    * Prints string to stdout, and returns string with additional utility methods like .to().
    *
    * @param text The text to print.
    * @return     Returns the string that was passed as argument.
    */
  def echo(text: String*): ShellString = js.native
  def error(): ShellString = js.native
  /**
    * Executes the given command synchronously.
    *
    * @param command The command to execute.
    * @return        Returns an object containing the return code and output as string.
    */
  def exec(command: String): ShellString = js.native
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
  def exec(command: String, options: ExecOptionsasyncfalse): ShellString = js.native
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
  def exec(command: String, options: ExecOptions): ShellString | ChildProcess = js.native
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
  def grep(options: String, regex_filter: String, files: js.Array[String]): ShellString = js.native
  def grep(options: String, regex_filter: RegExp, files: String*): ShellString = js.native
  def grep(options: String, regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
  def grep(regex_filter: String, files: String*): ShellString = js.native
  /**
    * Reads input string from given files and returns a string containing all lines
    * of the file that match the given `regex_filter`. Wildcard `*` accepted.
    *
    * @param regex_filter The regular expression to use.
    * @param files        The files to process.
    * @return             Returns a string containing all lines of the file that match the given `regex_filter`.
    */
  def grep(regex_filter: String, files: js.Array[String]): ShellString = js.native
  def grep(regex_filter: RegExp, files: String*): ShellString = js.native
  def grep(regex_filter: RegExp, files: js.Array[String]): ShellString = js.native
  def head(files: String*): ShellString = js.native
  def head(files: js.Array[String]): ShellString = js.native
  def head(options: HeadOptions, files: String*): ShellString = js.native
  def head(options: HeadOptions, files: js.Array[String]): ShellString = js.native
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
  def ln(options: String, source: String, dest: String): ShellString = js.native
  /**
    * Links source to dest. Use `-f` to force the link, should dest already exist.
    *
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def ln(source: String, dest: String): ShellString = js.native
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
  def mkdir(dir: String*): ShellString = js.native
  /**
    * Creates directories.
    *
    * @param dir Directories to create.
    * @return    Object with shell exit code, stderr and stdout.
    */
  def mkdir(dir: js.Array[String]): ShellString = js.native
  def mkdir(options: String, dir: String*): ShellString = js.native
  /**
    * Creates directories.
    *
    * @param options Available options:
    *        - `-p`: full paths, will create intermediate dirs if necessary
    * @param dir     The directories to create.
    * @return        Object with shell exit code, stderr and stdout.
    */
  def mkdir(options: String, dir: js.Array[String]): ShellString = js.native
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
  def mv(options: String, source: String, dest: String): ShellString = js.native
  def mv(options: String, source: js.Array[String], dest: String): ShellString = js.native
  /**
    * Moves files. The wildcard `*` is accepted.
    *
    * @param source The source.
    * @param dest   The destination.
    * @return       Object with shell exit code, stderr and stdout.
    */
  def mv(source: String, dest: String): ShellString = js.native
  def mv(source: js.Array[String], dest: String): ShellString = js.native
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
  def pwd(): ShellString = js.native
  def rm(files: String*): ShellString = js.native
  /**
    * Removes files. The wildcard `*` is accepted.
    *
    * @param files Files to remove.
    * @return      Object with shell exit code, stderr and stdout.
    */
  def rm(files: js.Array[String]): ShellString = js.native
  def rm(options: String, files: String*): ShellString = js.native
  /**
    * Removes files. The wildcard `*` is accepted.
    *
    * @param options Available options:
    *        - `-f`: force
    *        - `-r`, `-R`: recursive
    * @param files   Files to remove.
    * @return        Object with shell exit code, stderr and stdout.
    */
  def rm(options: String, files: js.Array[String]): ShellString = js.native
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
  def sed(options: String, searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  def sed(options: String, searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  def sed(options: String, searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
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
  def sed(searchRegex: String, replacement: String, files: js.Array[String]): ShellString = js.native
  def sed(searchRegex: RegExp, replacement: String, files: String*): ShellString = js.native
  def sed(searchRegex: RegExp, replacement: String, files: js.Array[String]): ShellString = js.native
  def set(options: String): Unit = js.native
  def sort(files: String*): ShellString = js.native
  /**
    * Return the contents of the files, sorted line-by-line.
    * Sorting multiple files mixes their content (just as unix sort does).
    */
  def sort(files: js.Array[String]): ShellString = js.native
  def sort(options: String, files: String*): ShellString = js.native
  /**
    * Return the contents of the files, sorted line-by-line.
    * Sorting multiple files mixes their content (just as unix sort does).
    *
    * @param options Available options:
    *        - `-r`: Reverse the results
    *        - `-n`: Compare according to numerical value
    */
  def sort(options: String, files: js.Array[String]): ShellString = js.native
  def tail(files: String*): ShellString = js.native
  def tail(files: js.Array[String]): ShellString = js.native
  def tail(options: TailOptions, files: String*): ShellString = js.native
  def tail(options: TailOptions, files: js.Array[String]): ShellString = js.native
  def tempdir(): ShellString = js.native
  def test(option: TestOptions, path: String): Boolean = js.native
  def touch(files: String*): ShellString = js.native
  def touch(files: js.Array[String]): ShellString = js.native
  def touch(options: TouchOptionsArray, files: String*): ShellString = js.native
  def touch(options: TouchOptionsArray, files: js.Array[String]): ShellString = js.native
  def touch(options: TouchOptionsLiteral, files: String*): ShellString = js.native
  def touch(options: TouchOptionsLiteral, files: js.Array[String]): ShellString = js.native
  /**
    * Filter adjacent matching lines from input.
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
  def which(command: String): ShellString = js.native
}

