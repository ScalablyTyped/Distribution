
# Scala.js typings for sindresorhus__class-names

Typings are for version 1.1.0

## Library description:
Conditionally join CSS class names together - Especially useful with React

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @sindresorhus/class-names |
| Keywords           | class-names, classnames, class, names, name, classes, react, jsx, component, join, concatenate, concat |
| # releases         | 3 |
| # dependents       | 4 |
| # downloads        | 15407 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/sindresorhus/class-names#readme)
- [Bugs](https://github.com/sindresorhus/class-names/issues)
- [Repository](https://github.com/sindresorhus/class-names)
- [Npm](https://www.npmjs.com/package/%40sindresorhus%2Fclass-names)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Conditionally join CSS class names together.

@param input - Accepts a combination of strings and objects. When an object, only object keys with truthy values are included. Anything else is ignored.

@example
```
import classNames = require('@sindresorhus/class-names');

classNames('unicorn', 'rainbow');
//=> 'unicorn rainbow'

classNames({awesome: true, foo: false}, 'unicorn', {rainbow: false});
//=> 'awesome unicorn'

classNames('unicorn', null, undefined, 0, 1, {foo: null});
//=> 'unicorn'

const buttonType = 'main';
classNames({[`button-${buttonType}`]: true});
//=> 'button-main'


const Button = props => {
	console.log(props);
	// {
	// 	type: 'success',
	// 	small: true
	// }

	const buttonClass = classNames(
		'button',
		{
			[`button-${props.type}`]: props.type,
			'button-block': props.block,
			'button-small': props.small
		}
	);

	console.log(buttonClass);
	//=> 'button button-success button-small'

	return <button className={buttonClass}>…</button>;
};
```
*/

```

