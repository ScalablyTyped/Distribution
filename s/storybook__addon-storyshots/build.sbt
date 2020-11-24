organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "6.1.2-9a8a6f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-106a62",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-4129f1",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-cc8fad",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-ff7814",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-4fced5",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-f0b0d1",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-e63227",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-3075c2",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-cef456",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-1df9fb",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-bab05f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200925Z-780360",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-8d21ff",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-af84f1",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "storybook__addons" % "6.1.2-8328c5",
  "org.scalablytyped" %%% "storybook__api" % "6.1.2-130b11",
  "org.scalablytyped" %%% "storybook__channels" % "6.1.2-e2465c",
  "org.scalablytyped" %%% "storybook__client-api" % "6.1.2-f35e09",
  "org.scalablytyped" %%% "storybook__router" % "6.1.2-e8a9a0",
  "org.scalablytyped" %%% "storybook__theming" % "6.1.2-a7cfbd",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-aa5679",
  "org.scalablytyped" %%% "typescript" % "4.1.2-5e4275")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
