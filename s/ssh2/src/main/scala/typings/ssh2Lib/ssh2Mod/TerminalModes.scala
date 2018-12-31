package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalModes
  extends /* mode */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]] {
  /** 7 bit mode. */
  var CS7: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** 8 bit mode. */
  var CS8: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Enable echoing. */
  var ECHO: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Echo control characters as ^(Char). */
  var ECHOCTL: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Visually erase chars. */
  var ECHOE: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Kill character discards current line. */
  var ECHOK: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Visual erase for line kill. */
  var ECHOKE: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Echo NL even if ECHO is off. */
  var ECHONL: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Canonicalize input lines. */
  var ICANON: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Map CR to NL on input. */
  var ICRNL: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Enable extensions. */
  var IEXTEN: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Ignore CR on input. */
  var IGNCR: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** The ignore parity flag.  The parameter SHOULD be `0` if this flag is FALSE, and `1` if it is TRUE. */
  var IGNPAR: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Ring bell on input queue full. */
  var IMAXBEL: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Map NL into CR on input. */
  var INLCR: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Enable checking of parity errors. */
  var INPCK: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Enable signals INTR, QUIT, [D]SUSP. */
  var ISIG: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Strip 8th bit off characters. */
  var ISTRIP: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Translate uppercase characters to lowercase. */
  var IUCLC: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Any char will restart after stop. */
  var IXANY: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Enable input flow control. */
  var IXOFF: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Enable output flow control. */
  var IXON: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Don't flush after interrupt. */
  var NOFLSH: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Translate carriage return to newline (output). */
  var OCRNL: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Convert lowercase to uppercase. */
  var OLCUC: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Map NL to CR-NL. */
  var ONLCR: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Newline performs a carriage return (output). */
  var ONLRET: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Translate newline to carriage return-newline (output). */
  var ONOCR: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Enable output processing. */
  var OPOST: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Parity enable. */
  var PARENB: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Mark parity and framing errors. */
  var PARMRK: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Odd parity, else even. */
  var PARODD: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Retype pending input. */
  var PENDIN: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Stop background jobs from output. */
  var TOSTOP: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
  /** Specifies the input baud rate in bits per second. */
  var TTY_OP_ISPEED: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the output baud rate in bits per second. */
  var TTY_OP_OSPEED: js.UndefOr[scala.Double] = js.undefined
  /** Toggles the flushing of terminal output. */
  var VDISCARD: js.UndefOr[scala.Double] = js.undefined
  /** Another suspend character. */
  var VDSUSP: js.UndefOr[scala.Double] = js.undefined
  /** End-of-file character (sends `EOF` from the terminal). */
  var VEOF: js.UndefOr[scala.Double] = js.undefined
  /** End-of-line character in addition to carriage return and/or linefeed. */
  var VEOL: js.UndefOr[scala.Double] = js.undefined
  /** Additional end-of-line character. */
  var VEOL2: js.UndefOr[scala.Double] = js.undefined
  /** Erase the character to left of the cursor. */
  var VERASE: js.UndefOr[scala.Double] = js.undefined
  /** Character to flush output. */
  var VFLUSH: js.UndefOr[scala.Double] = js.undefined
  /** Interrupt character; `255` if none. Not all of these characters are supported on all systems. */
  var VINTR: js.UndefOr[scala.Double] = js.undefined
  /** Kill the current input line. */
  var VKILL: js.UndefOr[scala.Double] = js.undefined
  /** Enter the next character typed literally, even if it is a special character */
  var VLNEXT: js.UndefOr[scala.Double] = js.undefined
  /** The quit character (sends `SIGQUIT` signal on POSIX systems). */
  var VQUIT: js.UndefOr[scala.Double] = js.undefined
  /** Reprints the current input line. */
  var VREPRINT: js.UndefOr[scala.Double] = js.undefined
  /** Continues paused output (normally control-Q). */
  var VSTART: js.UndefOr[scala.Double] = js.undefined
  /** Prints system status line (load, command, pid, etc). */
  var VSTATUS: js.UndefOr[scala.Double] = js.undefined
  /** Pauses output (normally control-S). */
  var VSTOP: js.UndefOr[scala.Double] = js.undefined
  /** Suspends the current program. */
  var VSUSP: js.UndefOr[scala.Double] = js.undefined
  /** Switch to a different shell layer. */
  var VSWTCH: js.UndefOr[scala.Double] = js.undefined
  /** Erases a word left of cursor. */
  var VWERASE: js.UndefOr[scala.Double] = js.undefined
  /** Enable input and output of uppercase characters by preceding their lowercase equivalents with `\`. */
  var XCASE: js.UndefOr[ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1`] = js.undefined
}

