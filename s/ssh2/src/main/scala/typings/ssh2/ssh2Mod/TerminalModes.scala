package typings.ssh2.ssh2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.ssh2.ssh2Numbers.`0`
import typings.ssh2.ssh2Numbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalModes
  extends /* mode */ StringDictionary[js.UndefOr[Double]] {
  /** 7 bit mode. */
  var CS7: js.UndefOr[`0` | `1`] = js.undefined
  /** 8 bit mode. */
  var CS8: js.UndefOr[`0` | `1`] = js.undefined
  /** Enable echoing. */
  var ECHO: js.UndefOr[`0` | `1`] = js.undefined
  /** Echo control characters as ^(Char). */
  var ECHOCTL: js.UndefOr[`0` | `1`] = js.undefined
  /** Visually erase chars. */
  var ECHOE: js.UndefOr[`0` | `1`] = js.undefined
  /** Kill character discards current line. */
  var ECHOK: js.UndefOr[`0` | `1`] = js.undefined
  /** Visual erase for line kill. */
  var ECHOKE: js.UndefOr[`0` | `1`] = js.undefined
  /** Echo NL even if ECHO is off. */
  var ECHONL: js.UndefOr[`0` | `1`] = js.undefined
  /** Canonicalize input lines. */
  var ICANON: js.UndefOr[`0` | `1`] = js.undefined
  /** Map CR to NL on input. */
  var ICRNL: js.UndefOr[`0` | `1`] = js.undefined
  /** Enable extensions. */
  var IEXTEN: js.UndefOr[`0` | `1`] = js.undefined
  /** Ignore CR on input. */
  var IGNCR: js.UndefOr[`0` | `1`] = js.undefined
  /** The ignore parity flag.  The parameter SHOULD be `0` if this flag is FALSE, and `1` if it is TRUE. */
  var IGNPAR: js.UndefOr[`0` | `1`] = js.undefined
  /** Ring bell on input queue full. */
  var IMAXBEL: js.UndefOr[`0` | `1`] = js.undefined
  /** Map NL into CR on input. */
  var INLCR: js.UndefOr[`0` | `1`] = js.undefined
  /** Enable checking of parity errors. */
  var INPCK: js.UndefOr[`0` | `1`] = js.undefined
  /** Enable signals INTR, QUIT, [D]SUSP. */
  var ISIG: js.UndefOr[`0` | `1`] = js.undefined
  /** Strip 8th bit off characters. */
  var ISTRIP: js.UndefOr[`0` | `1`] = js.undefined
  /** Translate uppercase characters to lowercase. */
  var IUCLC: js.UndefOr[`0` | `1`] = js.undefined
  /** Any char will restart after stop. */
  var IXANY: js.UndefOr[`0` | `1`] = js.undefined
  /** Enable input flow control. */
  var IXOFF: js.UndefOr[`0` | `1`] = js.undefined
  /** Enable output flow control. */
  var IXON: js.UndefOr[`0` | `1`] = js.undefined
  /** Don't flush after interrupt. */
  var NOFLSH: js.UndefOr[`0` | `1`] = js.undefined
  /** Translate carriage return to newline (output). */
  var OCRNL: js.UndefOr[`0` | `1`] = js.undefined
  /** Convert lowercase to uppercase. */
  var OLCUC: js.UndefOr[`0` | `1`] = js.undefined
  /** Map NL to CR-NL. */
  var ONLCR: js.UndefOr[`0` | `1`] = js.undefined
  /** Newline performs a carriage return (output). */
  var ONLRET: js.UndefOr[`0` | `1`] = js.undefined
  /** Translate newline to carriage return-newline (output). */
  var ONOCR: js.UndefOr[`0` | `1`] = js.undefined
  /** Enable output processing. */
  var OPOST: js.UndefOr[`0` | `1`] = js.undefined
  /** Parity enable. */
  var PARENB: js.UndefOr[`0` | `1`] = js.undefined
  /** Mark parity and framing errors. */
  var PARMRK: js.UndefOr[`0` | `1`] = js.undefined
  /** Odd parity, else even. */
  var PARODD: js.UndefOr[`0` | `1`] = js.undefined
  /** Retype pending input. */
  var PENDIN: js.UndefOr[`0` | `1`] = js.undefined
  /** Stop background jobs from output. */
  var TOSTOP: js.UndefOr[`0` | `1`] = js.undefined
  /** Specifies the input baud rate in bits per second. */
  var TTY_OP_ISPEED: js.UndefOr[Double] = js.undefined
  /** Specifies the output baud rate in bits per second. */
  var TTY_OP_OSPEED: js.UndefOr[Double] = js.undefined
  /** Toggles the flushing of terminal output. */
  var VDISCARD: js.UndefOr[Double] = js.undefined
  /** Another suspend character. */
  var VDSUSP: js.UndefOr[Double] = js.undefined
  /** End-of-file character (sends `EOF` from the terminal). */
  var VEOF: js.UndefOr[Double] = js.undefined
  /** End-of-line character in addition to carriage return and/or linefeed. */
  var VEOL: js.UndefOr[Double] = js.undefined
  /** Additional end-of-line character. */
  var VEOL2: js.UndefOr[Double] = js.undefined
  /** Erase the character to left of the cursor. */
  var VERASE: js.UndefOr[Double] = js.undefined
  /** Character to flush output. */
  var VFLUSH: js.UndefOr[Double] = js.undefined
  /** Interrupt character; `255` if none. Not all of these characters are supported on all systems. */
  var VINTR: js.UndefOr[Double] = js.undefined
  /** Kill the current input line. */
  var VKILL: js.UndefOr[Double] = js.undefined
  /** Enter the next character typed literally, even if it is a special character */
  var VLNEXT: js.UndefOr[Double] = js.undefined
  /** The quit character (sends `SIGQUIT` signal on POSIX systems). */
  var VQUIT: js.UndefOr[Double] = js.undefined
  /** Reprints the current input line. */
  var VREPRINT: js.UndefOr[Double] = js.undefined
  /** Continues paused output (normally control-Q). */
  var VSTART: js.UndefOr[Double] = js.undefined
  /** Prints system status line (load, command, pid, etc). */
  var VSTATUS: js.UndefOr[Double] = js.undefined
  /** Pauses output (normally control-S). */
  var VSTOP: js.UndefOr[Double] = js.undefined
  /** Suspends the current program. */
  var VSUSP: js.UndefOr[Double] = js.undefined
  /** Switch to a different shell layer. */
  var VSWTCH: js.UndefOr[Double] = js.undefined
  /** Erases a word left of cursor. */
  var VWERASE: js.UndefOr[Double] = js.undefined
  /** Enable input and output of uppercase characters by preceding their lowercase equivalents with `\`. */
  var XCASE: js.UndefOr[`0` | `1`] = js.undefined
}

object TerminalModes {
  @scala.inline
  def apply(
    CS7: `0` | `1` = null,
    CS8: `0` | `1` = null,
    ECHO: `0` | `1` = null,
    ECHOCTL: `0` | `1` = null,
    ECHOE: `0` | `1` = null,
    ECHOK: `0` | `1` = null,
    ECHOKE: `0` | `1` = null,
    ECHONL: `0` | `1` = null,
    ICANON: `0` | `1` = null,
    ICRNL: `0` | `1` = null,
    IEXTEN: `0` | `1` = null,
    IGNCR: `0` | `1` = null,
    IGNPAR: `0` | `1` = null,
    IMAXBEL: `0` | `1` = null,
    INLCR: `0` | `1` = null,
    INPCK: `0` | `1` = null,
    ISIG: `0` | `1` = null,
    ISTRIP: `0` | `1` = null,
    IUCLC: `0` | `1` = null,
    IXANY: `0` | `1` = null,
    IXOFF: `0` | `1` = null,
    IXON: `0` | `1` = null,
    NOFLSH: `0` | `1` = null,
    OCRNL: `0` | `1` = null,
    OLCUC: `0` | `1` = null,
    ONLCR: `0` | `1` = null,
    ONLRET: `0` | `1` = null,
    ONOCR: `0` | `1` = null,
    OPOST: `0` | `1` = null,
    PARENB: `0` | `1` = null,
    PARMRK: `0` | `1` = null,
    PARODD: `0` | `1` = null,
    PENDIN: `0` | `1` = null,
    StringDictionary: /* mode */ StringDictionary[js.UndefOr[Double]] = null,
    TOSTOP: `0` | `1` = null,
    TTY_OP_ISPEED: Int | Double = null,
    TTY_OP_OSPEED: Int | Double = null,
    VDISCARD: Int | Double = null,
    VDSUSP: Int | Double = null,
    VEOF: Int | Double = null,
    VEOL: Int | Double = null,
    VEOL2: Int | Double = null,
    VERASE: Int | Double = null,
    VFLUSH: Int | Double = null,
    VINTR: Int | Double = null,
    VKILL: Int | Double = null,
    VLNEXT: Int | Double = null,
    VQUIT: Int | Double = null,
    VREPRINT: Int | Double = null,
    VSTART: Int | Double = null,
    VSTATUS: Int | Double = null,
    VSTOP: Int | Double = null,
    VSUSP: Int | Double = null,
    VSWTCH: Int | Double = null,
    VWERASE: Int | Double = null,
    XCASE: `0` | `1` = null
  ): TerminalModes = {
    val __obj = js.Dynamic.literal()
    if (CS7 != null) __obj.updateDynamic("CS7")(CS7.asInstanceOf[js.Any])
    if (CS8 != null) __obj.updateDynamic("CS8")(CS8.asInstanceOf[js.Any])
    if (ECHO != null) __obj.updateDynamic("ECHO")(ECHO.asInstanceOf[js.Any])
    if (ECHOCTL != null) __obj.updateDynamic("ECHOCTL")(ECHOCTL.asInstanceOf[js.Any])
    if (ECHOE != null) __obj.updateDynamic("ECHOE")(ECHOE.asInstanceOf[js.Any])
    if (ECHOK != null) __obj.updateDynamic("ECHOK")(ECHOK.asInstanceOf[js.Any])
    if (ECHOKE != null) __obj.updateDynamic("ECHOKE")(ECHOKE.asInstanceOf[js.Any])
    if (ECHONL != null) __obj.updateDynamic("ECHONL")(ECHONL.asInstanceOf[js.Any])
    if (ICANON != null) __obj.updateDynamic("ICANON")(ICANON.asInstanceOf[js.Any])
    if (ICRNL != null) __obj.updateDynamic("ICRNL")(ICRNL.asInstanceOf[js.Any])
    if (IEXTEN != null) __obj.updateDynamic("IEXTEN")(IEXTEN.asInstanceOf[js.Any])
    if (IGNCR != null) __obj.updateDynamic("IGNCR")(IGNCR.asInstanceOf[js.Any])
    if (IGNPAR != null) __obj.updateDynamic("IGNPAR")(IGNPAR.asInstanceOf[js.Any])
    if (IMAXBEL != null) __obj.updateDynamic("IMAXBEL")(IMAXBEL.asInstanceOf[js.Any])
    if (INLCR != null) __obj.updateDynamic("INLCR")(INLCR.asInstanceOf[js.Any])
    if (INPCK != null) __obj.updateDynamic("INPCK")(INPCK.asInstanceOf[js.Any])
    if (ISIG != null) __obj.updateDynamic("ISIG")(ISIG.asInstanceOf[js.Any])
    if (ISTRIP != null) __obj.updateDynamic("ISTRIP")(ISTRIP.asInstanceOf[js.Any])
    if (IUCLC != null) __obj.updateDynamic("IUCLC")(IUCLC.asInstanceOf[js.Any])
    if (IXANY != null) __obj.updateDynamic("IXANY")(IXANY.asInstanceOf[js.Any])
    if (IXOFF != null) __obj.updateDynamic("IXOFF")(IXOFF.asInstanceOf[js.Any])
    if (IXON != null) __obj.updateDynamic("IXON")(IXON.asInstanceOf[js.Any])
    if (NOFLSH != null) __obj.updateDynamic("NOFLSH")(NOFLSH.asInstanceOf[js.Any])
    if (OCRNL != null) __obj.updateDynamic("OCRNL")(OCRNL.asInstanceOf[js.Any])
    if (OLCUC != null) __obj.updateDynamic("OLCUC")(OLCUC.asInstanceOf[js.Any])
    if (ONLCR != null) __obj.updateDynamic("ONLCR")(ONLCR.asInstanceOf[js.Any])
    if (ONLRET != null) __obj.updateDynamic("ONLRET")(ONLRET.asInstanceOf[js.Any])
    if (ONOCR != null) __obj.updateDynamic("ONOCR")(ONOCR.asInstanceOf[js.Any])
    if (OPOST != null) __obj.updateDynamic("OPOST")(OPOST.asInstanceOf[js.Any])
    if (PARENB != null) __obj.updateDynamic("PARENB")(PARENB.asInstanceOf[js.Any])
    if (PARMRK != null) __obj.updateDynamic("PARMRK")(PARMRK.asInstanceOf[js.Any])
    if (PARODD != null) __obj.updateDynamic("PARODD")(PARODD.asInstanceOf[js.Any])
    if (PENDIN != null) __obj.updateDynamic("PENDIN")(PENDIN.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (TOSTOP != null) __obj.updateDynamic("TOSTOP")(TOSTOP.asInstanceOf[js.Any])
    if (TTY_OP_ISPEED != null) __obj.updateDynamic("TTY_OP_ISPEED")(TTY_OP_ISPEED.asInstanceOf[js.Any])
    if (TTY_OP_OSPEED != null) __obj.updateDynamic("TTY_OP_OSPEED")(TTY_OP_OSPEED.asInstanceOf[js.Any])
    if (VDISCARD != null) __obj.updateDynamic("VDISCARD")(VDISCARD.asInstanceOf[js.Any])
    if (VDSUSP != null) __obj.updateDynamic("VDSUSP")(VDSUSP.asInstanceOf[js.Any])
    if (VEOF != null) __obj.updateDynamic("VEOF")(VEOF.asInstanceOf[js.Any])
    if (VEOL != null) __obj.updateDynamic("VEOL")(VEOL.asInstanceOf[js.Any])
    if (VEOL2 != null) __obj.updateDynamic("VEOL2")(VEOL2.asInstanceOf[js.Any])
    if (VERASE != null) __obj.updateDynamic("VERASE")(VERASE.asInstanceOf[js.Any])
    if (VFLUSH != null) __obj.updateDynamic("VFLUSH")(VFLUSH.asInstanceOf[js.Any])
    if (VINTR != null) __obj.updateDynamic("VINTR")(VINTR.asInstanceOf[js.Any])
    if (VKILL != null) __obj.updateDynamic("VKILL")(VKILL.asInstanceOf[js.Any])
    if (VLNEXT != null) __obj.updateDynamic("VLNEXT")(VLNEXT.asInstanceOf[js.Any])
    if (VQUIT != null) __obj.updateDynamic("VQUIT")(VQUIT.asInstanceOf[js.Any])
    if (VREPRINT != null) __obj.updateDynamic("VREPRINT")(VREPRINT.asInstanceOf[js.Any])
    if (VSTART != null) __obj.updateDynamic("VSTART")(VSTART.asInstanceOf[js.Any])
    if (VSTATUS != null) __obj.updateDynamic("VSTATUS")(VSTATUS.asInstanceOf[js.Any])
    if (VSTOP != null) __obj.updateDynamic("VSTOP")(VSTOP.asInstanceOf[js.Any])
    if (VSUSP != null) __obj.updateDynamic("VSUSP")(VSUSP.asInstanceOf[js.Any])
    if (VSWTCH != null) __obj.updateDynamic("VSWTCH")(VSWTCH.asInstanceOf[js.Any])
    if (VWERASE != null) __obj.updateDynamic("VWERASE")(VWERASE.asInstanceOf[js.Any])
    if (XCASE != null) __obj.updateDynamic("XCASE")(XCASE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalModes]
  }
}

