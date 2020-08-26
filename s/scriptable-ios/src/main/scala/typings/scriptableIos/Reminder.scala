package typings.scriptableIos

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Manages reminders in calendars._
  *
  * In order to add the reminder to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/reminder/#-new-reminder
  */
@js.native
trait Reminder extends js.Object {
  /**
    * _Calendar the reminder is stored in._
    * @see https://docs.scriptable.app/reminder/#calendar
    */
  var calendar: Calendar = js.native
  /**
    * _Completion date of reminder._
    * @see https://docs.scriptable.app/reminder/#completiondate
    */
  var completionDate: Date = js.native
  /**
    * _Creation date of reminder._
    * @see https://docs.scriptable.app/reminder/#creationdate
    */
  var creationDate: Date = js.native
  /**
    * _Due date of reminder._
    * @see https://docs.scriptable.app/reminder/#duedate
    */
  var dueDate: Date = js.native
  /**
    * _Whether the due date includes a time._
    *
    * When this is true, assignments to the `dueDate` property will include a time, when this is false, the time component of the date will be ignored. Defaults to true.
    * @see https://docs.scriptable.app/reminder/#duedateincludestime
    */
  var dueDateIncludesTime: Boolean = js.native
  /**
    * _Identifier of reminder._
    * @see https://docs.scriptable.app/reminder/#identifier
    */
  var identifier: String = js.native
  /**
    * _Whether the reminder is completed_
    * @see https://docs.scriptable.app/reminder/#iscompleted
    */
  var isCompleted: Boolean = js.native
  /**
    * _Notes associated with reminder._
    * @see https://docs.scriptable.app/reminder/#notes
    */
  var notes: String = js.native
  /**
    * _Priority of reminder._
    *
    * Specifies the prirority of the reminder with 0 representing an undefined priority, 1 the highest priority, and 9 the lowest priority.
    * @see https://docs.scriptable.app/reminder/#priority
    */
  var priority: Double = js.native
  /**
    * _Title of reminder._
    * @see https://docs.scriptable.app/reminder/#title
    */
  var title: String = js.native
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/reminder/#-addrecurrencerule
    */
  def addRecurrenceRule(recurrenceRule: RecurrenceRule): Unit = js.native
  /**
    * _Removes reminder from calendar._
    * @see https://docs.scriptable.app/reminder/#-remove
    */
  def remove(): Unit = js.native
  /**
    * _Removes all recurrence rules._
    * @see https://docs.scriptable.app/reminder/#-removeallrecurrencerules
    */
  def removeAllRecurrenceRules(): Unit = js.native
  /**
    * _Saves reminder._
    *
    * Saves changes to a reminder, inserting it into the calendar if it is newly created.
    * @see https://docs.scriptable.app/reminder/#-save
    */
  def save(): Unit = js.native
}

object Reminder {
  @scala.inline
  def apply(
    addRecurrenceRule: RecurrenceRule => Unit,
    calendar: Calendar,
    completionDate: Date,
    creationDate: Date,
    dueDate: Date,
    dueDateIncludesTime: Boolean,
    identifier: String,
    isCompleted: Boolean,
    notes: String,
    priority: Double,
    remove: () => Unit,
    removeAllRecurrenceRules: () => Unit,
    save: () => Unit,
    title: String
  ): Reminder = {
    val __obj = js.Dynamic.literal(addRecurrenceRule = js.Any.fromFunction1(addRecurrenceRule), calendar = calendar.asInstanceOf[js.Any], completionDate = completionDate.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], dueDateIncludesTime = dueDateIncludesTime.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isCompleted = isCompleted.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removeAllRecurrenceRules = js.Any.fromFunction0(removeAllRecurrenceRules), save = js.Any.fromFunction0(save), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reminder]
  }
  @scala.inline
  implicit class ReminderOps[Self <: Reminder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddRecurrenceRule(value: RecurrenceRule => Unit): Self = this.set("addRecurrenceRule", js.Any.fromFunction1(value))
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletionDate(value: Date): Self = this.set("completionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDueDate(value: Date): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDueDateIncludesTime(value: Boolean): Self = this.set("dueDateIncludesTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCompleted(value: Boolean): Self = this.set("isCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveAllRecurrenceRules(value: () => Unit): Self = this.set("removeAllRecurrenceRules", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

