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

object TerminalModes {
  @scala.inline
  def apply(
    CS7: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    CS8: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ECHO: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ECHOCTL: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ECHOE: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ECHOK: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ECHOKE: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ECHONL: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ICANON: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ICRNL: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IEXTEN: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IGNCR: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IGNPAR: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IMAXBEL: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    INLCR: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    INPCK: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ISIG: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ISTRIP: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IUCLC: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IXANY: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IXOFF: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    IXON: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    NOFLSH: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    OCRNL: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    OLCUC: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ONLCR: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ONLRET: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    ONOCR: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    OPOST: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    PARENB: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    PARMRK: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    PARODD: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    PENDIN: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    StringDictionary: /* mode */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]] = null,
    TOSTOP: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null,
    TTY_OP_ISPEED: scala.Int | scala.Double = null,
    TTY_OP_OSPEED: scala.Int | scala.Double = null,
    VDISCARD: scala.Int | scala.Double = null,
    VDSUSP: scala.Int | scala.Double = null,
    VEOF: scala.Int | scala.Double = null,
    VEOL: scala.Int | scala.Double = null,
    VEOL2: scala.Int | scala.Double = null,
    VERASE: scala.Int | scala.Double = null,
    VFLUSH: scala.Int | scala.Double = null,
    VINTR: scala.Int | scala.Double = null,
    VKILL: scala.Int | scala.Double = null,
    VLNEXT: scala.Int | scala.Double = null,
    VQUIT: scala.Int | scala.Double = null,
    VREPRINT: scala.Int | scala.Double = null,
    VSTART: scala.Int | scala.Double = null,
    VSTATUS: scala.Int | scala.Double = null,
    VSTOP: scala.Int | scala.Double = null,
    VSUSP: scala.Int | scala.Double = null,
    VSWTCH: scala.Int | scala.Double = null,
    VWERASE: scala.Int | scala.Double = null,
    XCASE: ssh2Lib.ssh2LibNumbers.`0` | ssh2Lib.ssh2LibNumbers.`1` = null
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

