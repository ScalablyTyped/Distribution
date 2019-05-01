package typings
package shelljsDashExecDashProxyLib.shelljsDashExecDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShelljsExecProxy
  extends /* k */ org.scalablytyped.runtime.StringDictionary[Exec] {
  @JSName("ShellString")
  val ShellString_Original: shelljsLib.shelljsMod.ShellStringConstructor = js.native
  val config: shelljsLib.shelljsMod.ShellConfig = js.native
  val env: nodeLib.NodeJSNs.ProcessEnv = js.native
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
  	 * @param value 	The string value to wrap.
  	 * @return				A string-like object with special methods.
  	 */
  def ShellString(value: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def ShellString(value: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellArray = js.native
  def cat(files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
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
  def cat(files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def cd(): shelljsLib.shelljsMod.ShellString = js.native
  def cd(dir: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
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
  def chmod(mode: java.lang.String, file: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def chmod(mode: scala.Double, file: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
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
  def chmod(options: java.lang.String, mode: java.lang.String, file: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def chmod(options: java.lang.String, mode: scala.Double, file: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
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
  def cp(options: java.lang.String, source: java.lang.String, dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def cp(options: java.lang.String, source: js.Array[java.lang.String], dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Copies files. The wildcard `*` is accepted.
  	 *
  	 * @param source The source.
  	 * @param dest   The destination.
  	 * @return       Object with shell exit code, stderr and stdout.
  	 */
  def cp(source: java.lang.String, dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def cp(source: js.Array[java.lang.String], dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
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
  def dirs(options: java.lang.String): shelljsLib.shelljsMod.ShellArray | shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Displays the list of currently remembered directories.
  	 *
  	 * @param options Displays the Nth directory (counting from the left of the list
  	 *                printed by dirs when invoked without options), starting with zero.
  	 * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
  	 */
  @JSName("dirs")
  def `dirs_+N`(options: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`+N`): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Displays the list of currently remembered directories.
  	 *
  	 * @param options Displays the Nth directory (counting from the right of the list
  	 *                printed by dirs when invoked without options), starting with zero.
  	 * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
  	 */
  @JSName("dirs")
  def `dirs_-N`(options: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`-N`): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Clears the directory stack by deleting all of the elements.
  	 *
  	 * @param options Clears the directory stack by deleting all of the elements.
  	 * @return        Returns an array of paths in the stack, or a single path if +N or -N was specified.
  	 */
  @JSName("dirs")
  def `dirs_-c`(options: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`-c`): shelljsLib.shelljsMod.ShellArray = js.native
  /**
  	 * Prints string to stdout, and returns string with additional utility methods like .to().
  	 *
  	 * @param options Available options:
  	 *        - `-e`: interpret backslash escapes (default)
  	 *        - `-n`: remove trailing newline from output
  	 * @param text The text to print.
  	 * @return     Returns the string that was passed as argument.
  	 */
  def echo(options: java.lang.String, text: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Prints string to stdout, and returns string with additional utility methods like .to().
  	 *
  	 * @param text The text to print.
  	 * @return     Returns the string that was passed as argument.
  	 */
  def echo(text: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def error(): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @return        Returns an object containing the return code and output as string.
  	 */
  def exec(command: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param callback Receives code and output asynchronously.
  	 */
  def exec(command: java.lang.String, callback: shelljsLib.shelljsMod.ExecCallback): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  /**
  	 * Executes the given command.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @return        Returns an object containing the return code and output as string,
  	 *                or if `{async: true}` was passed, a `ChildProcess`.
  	 */
  def exec(command: java.lang.String, options: shelljsLib.shelljsMod.ExecOptions): shelljsLib.shelljsMod.ShellString | nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @param callback Receives code and output asynchronously.
  	 */
  def exec(
    command: java.lang.String,
    options: shelljsLib.shelljsMod.ExecOptions,
    callback: shelljsLib.shelljsMod.ExecCallback
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  /**
  	 * Executes the given command asynchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @return        Returns an object containing the return code and output as string,
  	 *                or if `{async: true}` was passed, a `ChildProcess`.
  	 */
  @JSName("exec")
  def exec_ChildProcess(
    command: java.lang.String,
    options: shelljsLib.shelljsMod.ExecOptions with shelljsLib.Anon_AsyncTrue
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  /**
  	 * Executes the given command synchronously.
  	 *
  	 * @param command The command to execute.
  	 * @param options Silence and synchronous options.
  	 * @return        Returns an object containing the return code and output as string,
  	 *                or if `{async: true}` was passed, a `ChildProcess`.
  	 */
  @JSName("exec")
  def exec_ShellString(command: java.lang.String, options: shelljsLib.shelljsMod.ExecOptions with shelljsLib.Anon_Async): shelljsLib.shelljsMod.ShellString = js.native
  def exit(): scala.Nothing = js.native
  def exit(code: scala.Double): scala.Nothing = js.native
  def find(path: java.lang.String*): shelljsLib.shelljsMod.ShellArray = js.native
  /**
  	 * Returns array of all files (however deep) in the given paths.
  	 *
  	 * @param path The path(s) to search.
  	 * @return     An array of all files (however deep) in the given path(s).
  	 */
  def find(path: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellArray = js.native
  def grep(options: java.lang.String, regex_filter: java.lang.String, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
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
  def grep(options: java.lang.String, regex_filter: java.lang.String, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def grep(options: java.lang.String, regex_filter: stdLib.RegExp, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def grep(options: java.lang.String, regex_filter: stdLib.RegExp, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def grep(regex_filter: java.lang.String, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Reads input string from given files and returns a string containing all lines
  	 * of the file that match the given `regex_filter`. Wildcard `*` accepted.
  	 *
  	 * @param regex_filter The regular expression to use.
  	 * @param files        The files to process.
  	 * @return             Returns a string containing all lines of the file that match the given `regex_filter`.
  	 */
  def grep(regex_filter: java.lang.String, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def grep(regex_filter: stdLib.RegExp, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def grep(regex_filter: stdLib.RegExp, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def head(files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def head(files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def head(options: shelljsLib.shelljsMod.HeadOptions, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def head(options: shelljsLib.shelljsMod.HeadOptions, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
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
  def ln(options: java.lang.String, source: java.lang.String, dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Links source to dest. Use `-f` to force the link, should dest already exist.
  	 *
  	 * @param source The source.
  	 * @param dest   The destination.
  	 * @return       Object with shell exit code, stderr and stdout.
  	 */
  def ln(source: java.lang.String, dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def ls(options: java.lang.String, paths: java.lang.String*): shelljsLib.shelljsMod.ShellArray = js.native
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
  def ls(options: java.lang.String, paths: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellArray = js.native
  def ls(paths: java.lang.String*): shelljsLib.shelljsMod.ShellArray = js.native
  /**
  	 * Returns array of files in the given path, or in current directory if no path provided.
  	 *
  	 * @param paths Paths to search.
  	 * @return      An array of files in the given path(s).
  	 */
  def ls(paths: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellArray = js.native
  def mkdir(dir: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Creates directories.
  	 *
  	 * @param dir Directories to create.
  	 * @return    Object with shell exit code, stderr and stdout.
  	 */
  def mkdir(dir: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def mkdir(options: java.lang.String, dir: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Creates directories.
  	 *
  	 * @param options Available options:
  	 *        - `-p`: full paths, will create intermediate dirs if necessary
  	 * @param dir     The directories to create.
  	 * @return        Object with shell exit code, stderr and stdout.
  	 */
  def mkdir(options: java.lang.String, dir: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
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
  def mv(options: java.lang.String, source: java.lang.String, dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def mv(options: java.lang.String, source: js.Array[java.lang.String], dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Moves files. The wildcard `*` is accepted.
  	 *
  	 * @param source The source.
  	 * @param dest   The destination.
  	 * @return       Object with shell exit code, stderr and stdout.
  	 */
  def mv(source: java.lang.String, dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def mv(source: js.Array[java.lang.String], dest: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * When no arguments are given, popd removes the top directory from the stack
  	 * and performs a `cd` to the new top directory.
  	 *
  	 * The elements are numbered from 0 starting at the first directory listed with dirs;
  	 * i.e., `popd` is equivalent to `popd +0`. Returns an array of paths in the stack.
  	 *
  	 * @return     Returns an array of paths in the stack.
  	 */
  def popd(): shelljsLib.shelljsMod.ShellArray = js.native
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
  def popd(dir: java.lang.String): shelljsLib.shelljsMod.ShellArray = js.native
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
  def popd(options: java.lang.String, dir: java.lang.String): shelljsLib.shelljsMod.ShellArray = js.native
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
  def `popd_+N`(dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`+N`): shelljsLib.shelljsMod.ShellArray = js.native
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
  def `popd_+N`(
    options: java.lang.String,
    dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`+N`
  ): shelljsLib.shelljsMod.ShellArray = js.native
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
  def `popd_-N`(dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`-N`): shelljsLib.shelljsMod.ShellArray = js.native
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
  def `popd_-N`(
    options: java.lang.String,
    dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`-N`
  ): shelljsLib.shelljsMod.ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @return Returns an array of paths in the stack.
  	 */
  def pushd(): shelljsLib.shelljsMod.ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param dir Makes the current working directory be the top of the stack,
  	 *            and then executes the equivalent of cd dir.
  	 * @return    Returns an array of paths in the stack.
  	 */
  def pushd(dir: java.lang.String): shelljsLib.shelljsMod.ShellArray = js.native
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
  def pushd(options: java.lang.String, dir: java.lang.String): shelljsLib.shelljsMod.ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param dir Brings the Nth directory (counting from the left of the list printed by dirs,
  	 *            starting with zero) to the top of the list by rotating the stack.
  	 * @return    Returns an array of paths in the stack.
  	 */
  @JSName("pushd")
  def `pushd_+N`(dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`+N`): shelljsLib.shelljsMod.ShellArray = js.native
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
  def `pushd_+N`(
    options: java.lang.String,
    dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`+N`
  ): shelljsLib.shelljsMod.ShellArray = js.native
  /**
  	 * Saves the current directory on the top of the directory stack and then cd to dir.
  	 * With no arguments, `pushd` exchanges the top two directories.
  	 *
  	 * @param dir Brings the Nth directory (counting from the right of the list printed by dirs,
  	 *            starting with zero) to the top of the list by rotating the stack.
  	 * @return    Returns an array of paths in the stack.
  	 */
  @JSName("pushd")
  def `pushd_-N`(dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`-N`): shelljsLib.shelljsMod.ShellArray = js.native
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
  def `pushd_-N`(
    options: java.lang.String,
    dir: shelljsDashExecDashProxyLib.shelljsDashExecDashProxyLibStrings.`-N`
  ): shelljsLib.shelljsMod.ShellArray = js.native
  def pwd(): shelljsLib.shelljsMod.ShellString = js.native
  def rm(files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Removes files. The wildcard `*` is accepted.
  	 *
  	 * @param files Files to remove.
  	 * @return      Object with shell exit code, stderr and stdout.
  	 */
  def rm(files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def rm(options: java.lang.String, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Removes files. The wildcard `*` is accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-f`: force
  	 *        - `-r`, `-R`: recursive
  	 * @param files   Files to remove.
  	 * @return        Object with shell exit code, stderr and stdout.
  	 */
  def rm(options: java.lang.String, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def sed(
    options: java.lang.String,
    searchRegex: java.lang.String,
    replacement: java.lang.String,
    files: java.lang.String*
  ): shelljsLib.shelljsMod.ShellString = js.native
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
  def sed(
    options: java.lang.String,
    searchRegex: java.lang.String,
    replacement: java.lang.String,
    files: js.Array[java.lang.String]
  ): shelljsLib.shelljsMod.ShellString = js.native
  def sed(
    options: java.lang.String,
    searchRegex: stdLib.RegExp,
    replacement: java.lang.String,
    files: java.lang.String*
  ): shelljsLib.shelljsMod.ShellString = js.native
  def sed(
    options: java.lang.String,
    searchRegex: stdLib.RegExp,
    replacement: java.lang.String,
    files: js.Array[java.lang.String]
  ): shelljsLib.shelljsMod.ShellString = js.native
  def sed(searchRegex: java.lang.String, replacement: java.lang.String, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Reads an input string from file and performs a JavaScript `replace()`
  	 * on the input using the given search regex and replacement string or function.
  	 *
  	 * @param searchRegex The regular expression to use for search.
  	 * @param replacement The replacement.
  	 * @param files       The files to process.
  	 * @return            The new string after replacement.
  	 */
  def sed(searchRegex: java.lang.String, replacement: java.lang.String, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def sed(searchRegex: stdLib.RegExp, replacement: java.lang.String, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def sed(searchRegex: stdLib.RegExp, replacement: java.lang.String, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def set(options: java.lang.String): scala.Unit = js.native
  def sort(files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Return the contents of the files, sorted line-by-line.
  	 * Sorting multiple files mixes their content (just as unix sort does).
  	 */
  def sort(files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def sort(options: java.lang.String, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Return the contents of the files, sorted line-by-line.
  	 * Sorting multiple files mixes their content (just as unix sort does).
  	 *
  	 * @param options Available options:
  	 *        - `-r`: Reverse the results
  	 *        - `-n`: Compare according to numerical value
  	 */
  def sort(options: java.lang.String, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def tail(files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def tail(files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def tail(options: shelljsLib.shelljsMod.TailOptions, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def tail(options: shelljsLib.shelljsMod.TailOptions, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def tempdir(): shelljsLib.shelljsMod.ShellString = js.native
  def test(option: shelljsLib.shelljsMod.TestOptions, path: java.lang.String): scala.Boolean = js.native
  def touch(files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def touch(files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def touch(options: shelljsLib.shelljsMod.TouchOptionsArray, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def touch(options: shelljsLib.shelljsMod.TouchOptionsArray, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  def touch(options: shelljsLib.shelljsMod.TouchOptionsLiteral, files: java.lang.String*): shelljsLib.shelljsMod.ShellString = js.native
  def touch(options: shelljsLib.shelljsMod.TouchOptionsLiteral, files: js.Array[java.lang.String]): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Filter adjacent matching lines from input.
  	 */
  def uniq(input: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  /**
  	 * Filter adjacent matching lines from input.
  	 *
  	 * @param options Available options:
  	 *        - `-i`: Ignore case while comparing
  	 *        - `-c`: Prefix lines by the number of occurrences
  	 *        - `-d`: Only print duplicate lines, one for each group of identical lines
  	 */
  def uniq(options: java.lang.String, input: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def uniq(options: java.lang.String, input: java.lang.String, output: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
  def which(command: java.lang.String): shelljsLib.shelljsMod.ShellString = js.native
}

